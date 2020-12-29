package com.peijun.log.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * appender 通过 <appender> 元素进行配置，需要两个强制的属性 name 与 class。
 * name 属性用来指定 appender 的名字，class 属性需要指定类的全限定名用于实例化。
 *
 * <appender> 元素可以包含 0 或一个 <layout> 元素，0 或多个 <encoder> 元素，0 或多个 <filter> 元素。
 * 除了这些公共的元素之外，<appender> 元素可以包含任意与 appender 类的 JavaBean 属性相一致的元素。
 *
 *
 * <layout> 元素强制一个 class 属性去指定一个类的全限定名，用于实例化。
 * 与 <appender> 元素一样，<layout> 元素也可以包含与 layout 实例相关的属性。
 * 如果 layout 的 class 是 PatternLayout，那么 class 属性可以被隐藏掉
 *
 * <encoder> 元素强制一个 class 属性去指定一个类的全限定名，用于实例化。
 * 如果 encoder 的 class 是 PatternLayoutEncoder，那么基于默认类映射，class 属性可以被隐藏。
 *
 * appender 通过 appender-ref 元素附加到 root logger 上。
 * 每一个 appender 都有自己 encoder。encoder 通常不会设计成给所有的 appender 共享。
 * 对于 layout 也是如此。因此，logback 不会提供任何共享 encoder 和 layout 的语法。
 */
public class Demo05Appender {
    final static Logger logger = LoggerFactory.getLogger(Demo05Appender.class);

    public static void main(String[] args) {
        printLog();
    }

    public static void printLog() {
        logger.debug("我是debug信息");
        logger.info("我是info信息");
        logger.warn("我是warn信息");
    }
}
