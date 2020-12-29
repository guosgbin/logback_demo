package com.peijun.log.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * logback 支持变量的定义以及替换，变量有它的作用域。
 * 而且，变量可以在配置文件中，外部文件中，外部资源文件中，甚至动态定义。
 */
public class Demo08Variable {
    final static Logger logger = LoggerFactory.getLogger(Demo08Variable.class);

    public static void main(String[] args) {
        // -DUSER_HOME=data/logss -DUSER_HOME2=12
//        System.out.println(System.getProperty("USER_NAME"));
//        System.out.println(System.getProperty("USER_NAME2"));

        printLog();
    }

    public static void printLog() {
        logger.debug("我是debug信息");
        logger.info("我是info信息");
        logger.warn("我是warn信息");
    }
}
