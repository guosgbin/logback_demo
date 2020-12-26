package com.peijun.log.starter;

import ch.qos.logback.classic.Level;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 任何日志 API 的优势在于它能够禁止某些日志的输出,但是又不会妨碍另一些日志的输出.
 * 通过假定一个日志空间,这个空间包含所有可能的日志语句,这些日志语句根据开发人员设定的标准来进行分类.
 * 在 logback-classic 中,分类是 logger 的一部分,
 * 每一个 logger 都依附在 LoggerContext 上,它负责产生 logger,并且通过一个树状的层级结构来进行管理.
 *
 *
 * 名为 com.foo 的 logger 是名为 com.foo.Bar 的 logger 的父级.
 * 名为 java 的 logger 是名为 java.util 的父级,是名为 java.util.Vector 的祖先.
 *
 * Logger 能够被分成不同的等级
 * 不同的等级（TRACE, DEBUG, INFO, WARN, ERROR）定义在 ch.qos.logback.classic.Level 类中.
 * 在 logback 中,类 Level 使用 final 修饰的,所以它不能用来被继承.一种更灵活的方式是使用 Marker 对象.
 *
 * 如果一个给定的 logger 没有指定一个层级,那么它就会继承离它最近的一个祖先的层级.更正式的说法是：
 * 对于一个给定的名为 L 的 logger,它的有效层级为从自身一直回溯到 root logger,直到找到第一个不为空的层级作为自己的层级.
 * 
 * 为了确保所有的 logger 都有一个层级,root logger 会有一个默认层级 --- DEBUG
 *
 *
 * 在每个类里面通过指定全限定类名为 logger 的名字来实例化一个 logger 是最好也是最简单的方式。
 * 因为日志能够输出这个 logger 的名字，所以这个命名策略能够看出日志的来源是哪里。
 * 虽然这是命名 logger 常见的策略，但是 logback 不会严格限制 logger 的命名，你完全可以根据自己的喜好来，你开心就好。
 */
public class StarterDemo02 {
    public static void main(String[] args) {
//        Logger logger = LoggerFactory.getLogger(StarterDemo02.class);

        // ch.qos.logback.classic.Logger 可以设置日志的级别
        ch.qos.logback.classic.Logger logger =
                (ch.qos.logback.classic.Logger)LoggerFactory.getLogger("com.peijun");

        logger.setLevel(Level.WARN);
        logger.trace("我是trance日志");
        logger.debug("我是debug日志");
        logger.info("我是info日志");
        logger.warn("我是warn日志");
        logger.error("我是error日志");

        System.out.println("======");
        // "com.peijun.log" 会继承 "com.peijun" 的有效级别
        Logger subsetLogger = LoggerFactory.getLogger("com.peijun.log");
        // 这条日志不会打印
        subsetLogger.info("下级info日志");
        // 这条日志会打印
        subsetLogger.error("下级error日志");
    }
}
