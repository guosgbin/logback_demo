package com.peijun.log.config;

import com.peijun.log.config.chapter.Demo04NotSeeSomeLevel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 不展示 com.peijun.log.config包中任何debug信息
 */
public class Demo03NotSeeSomeLevel {
    final static Logger logger = LoggerFactory.getLogger(Demo03NotSeeSomeLevel.class);

    public static void main(String[] args) {
        printLog();
    }

    /**
     * {@link Demo04NotSeeSomeLevel}
     */
    public static void printLog() {
        logger.debug("我是 com.peijun.log.config 包下的debug信息");
        logger.info("我是 com.peijun.log.config 包下的info信息");
        logger.warn("我是 com.peijun.log.config 包下的warn信息");
    }
}
