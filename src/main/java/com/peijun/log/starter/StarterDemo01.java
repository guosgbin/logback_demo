package com.peijun.log.starter;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.util.StatusPrinter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 日志框架入门实例.
 *
 * 由于 logback 默认的配置策略
 * 当没有默认的配置时,logback 将会在 root logger 中新增一个 ConsoleAppender.
 *
 * Logback 没有找到 logback-test.xml 和 logback.xml 配置文件,所以通过默认的配置策略-添加一个基本的 ConsoleAppender 来进行配置.
 * Appender 类被看作为输出的目的地.
 * Appenders 包括 console,files,Syslog,TCP Sockets,JMS 等等其它的日志输出目的地.
 * 用户可以根据自己的情况轻松的创建自己的 Appender.
 *
 * 如果发生了错误,logback 会自动在控制台打印自己内部的状态信息.
 */
public class StarterDemo01 {

    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(StarterDemo01.class);

        logger.trace("我是trance日志");
        logger.debug("我是debug日志");
        logger.info("我是info日志");
        logger.warn("我是warn日志");
        logger.error("我是error日志");

        // 打印内部的状态
        LoggerContext lc = (LoggerContext)LoggerFactory.getILoggerFactory();
        StatusPrinter.print(lc);

        System.out.println("=====");
    }

}
