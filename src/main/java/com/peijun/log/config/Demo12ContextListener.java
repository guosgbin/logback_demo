package com.peijun.log.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * http://blog.jboost.cn/trick-logback-prop.html
 *
 * 定义一个实现LoggerContextListener接口的类，在start方法中，将需要设置的属性设置到logback的Context中，
 * 这种方式能设置任意个数的属性值，比前一种方式灵活。
 *
 * # https://www.cnblogs.com/tc971121/p/12655118.html
 */
public class Demo12ContextListener {
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
