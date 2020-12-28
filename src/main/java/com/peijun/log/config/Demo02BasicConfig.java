package com.peijun.log.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.TimeUnit;

/**
 * 通过配置文件 实现logback默认的配置
 * <p>
 * 打印和例子1 一摸一样的日志格式
 *
 *
 * <p>
 * <configuration debug="true">
 * </p>
 * <p>
 * 如果配置文件的配置有问题，logback 会检测到这个错误并且在控制台打印它的内部状态。
 * 但是，如果配置文件没有被找到，logback 不会打印它的内部状态信息，因为没有检测到错误。
 * 通过编码方式调用 StatusPrinter.print() 方法会在任何情况下都打印状态信息。
 * <p>
 * 设置 debug="true" 与配置 OnConsoleStatusListener 的效果完全一样。
 * <p>
 * <statusListener class="ch.qos.logback.core.status.OnConsoleStatusListener" />
 * </p>
 *
 * 当设置了 scan="true"，会新建一个 ReconfigureOnChangeTask 任务用于监视配置文件是否变化。
 * ReconfigureOnChangeTask 也会自动监视外部文件的变化。   注意：本地测试需要去修改target里的xml
 *
 * scanPeriod="5 seconds"
 *  单位 milliseconds, seconds, minutes , hours
 *
 *   packagingData="true" 展示包数据
 */
public class Demo02BasicConfig {

    final static Logger logger = LoggerFactory.getLogger(Demo02BasicConfig.class);

    public static void main(String[] args) throws InterruptedException {

//        LoggerContext lc = (LoggerContext)LoggerFactory.getILoggerFactory();
//        StatusPrinter.print(lc);

        while (true) {
            logger.info("进入项目");
            logger.debug("项目运行中...");
            logger.info("退出项目");
            TimeUnit.SECONDS.sleep(2);
        }

    }
}
