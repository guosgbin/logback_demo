package com.peijun.log.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 每一个 logger 都会附加到一个 logger context 上去。
 * 默认这个 logger context 的名字为 "default"。
 * 但是你可以通过 <contextName> 设置其它的名字。
 * 但是如果设置过一次就不能再设置。当多个应用输出日志到同一个目的地，设置 logger context 的名字可以更好的区分。
 */
public class Demo07ContextName {
    final static Logger logger = LoggerFactory.getLogger(Demo07ContextName.class);

    public static void main(String[] args) {
        printLog();
    }

    public static void printLog() {
        logger.debug("我是debug信息");
        logger.info("我是info信息");
        logger.warn("我是warn信息");
    }
}
