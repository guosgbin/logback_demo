package com.peijun.log.config.configuration;

import ch.qos.logback.core.PropertyDefinerBase;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.UUID;

/**
 * 在logback.xml中获取自定义变量值。
 *
 * 我们可以通过在logback.xml中配置appender来指定日志输出格式及输出文件路径，
 * 这在一台主机或一个文件系统上部署单个实例没有问题，但是如果部署多个实例（比如通过容器的方式），
 * 多个实例同时往同一文件写日志可能就会引起问题。
 * 这时可以将每个实例的日志文件加以区分，如IP或UUID，或两者结合的形式。
 *
 * 可以有4种方式来实现logback.xml中获取自定义变量值：
 *
 * 1.通过设置环境变量或传递系统属性（比如在程序启动时通过-D传递）的方式，两者是可以直接在logback.xml中通过 ${变量名} 获取的。
 * 2.自定义logback.xml的加载时机，在其加载前将需要设置的属性注入到logback的context中，这种方式相对复杂，本文不讨论。
 * 3.通过实现PropertyDefiner接口来提供属性值设置
 * 4.通过实现LoggerContextListener接口来设置属性值
 *
 * 第一种方式简单，但不能通过程序生成属性值，第二种方式稍显复杂，本文主要介绍后两种方式。
 */


/***
 * 将本地IP拼接到日志文件名中，以区分不同实例，避免存储到同一位置时的覆盖冲突问题
 *
 * @Author ronwxy
 * @Date 2019/8/20 16:17
 */
public class IPLogDefiner extends PropertyDefinerBase {

    private static final Logger LOG = LoggerFactory.getLogger(IPLogDefiner.class);

    private String getUniqName() {
        String localIp = null;
        try {
            localIp = InetAddress.getLocalHost().getHostAddress();
        } catch (UnknownHostException e) {
            LOG.error("fail to get ip...", e);
        }
        String uniqName = UUID.randomUUID().toString().replace("-", "");
        if (localIp != null) {
            uniqName = localIp + "-" + uniqName;
        }
        return uniqName;
    }


    /**
     * 返回需要生成的值，本例中是返回 本地IP-UUID 的形式。
     * @return
     */
    @Override
    public String getPropertyValue() {
        return getUniqName();
    }
}