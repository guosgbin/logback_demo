package com.peijun.log.config.chapter;

import com.peijun.log.config.Demo03NotSeeSomeLevel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 设置com.peijun.log.config包的level为debug
 * 设置com.peijun.log.config.chapter包的level为info
 */
public class Demo04NotSeeSomeLevel {
    final static Logger logger = LoggerFactory.getLogger(Demo04NotSeeSomeLevel.class);

    /**
     * {@link Demo03NotSeeSomeLevel}
     *
     * @param args
     */
    public static void main(String[] args) {
        printLog();
        Demo03NotSeeSomeLevel.printLog();
    }

    public static void printLog() {
        logger.debug("我是 com.peijun.log.config.chapter 包下的debug信息");
        logger.info("我是 com.peijun.log.config.chapter 包下的info信息");
        logger.warn("我是 com.peijun.log.config.chapter 包下的warn信息");
    }
}
