package com.peijun.log.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 引入外部配置文件
 *
 * 通过 <include> 元素可以引入外部的配置文件
 *
 * 可以通过如下几个属性引入文件：
 *
 * 通过文件引入：
 *      可以通过 file 属性引入外部文件。可以通过相对路径或者绝对路径来引入。相对路径是指相对应用程序的路径。
 *
 * 通过资源文件引入
 *      可以通过 resource 属性来引入位于 classpath 路径下的资源文件。
 *      <include resource="includedConfig.xml"/>
 *
 * 通过 url 引入文件
 *
 * 可以通过 url 属性来引入外部文件。
 *
 * <include url="http://some.host.com/includedConfig.xml"/>
 *
 *
 */
public class Demo11Include {
    final static Logger logger = LoggerFactory.getLogger(Demo11Include.class);

    public static void main(String[] args) {
        printLog();
    }

    public static void printLog() {
        logger.debug("我是debug信息");
        logger.info("我是info信息");
        logger.warn("我是warn信息");
    }
}
