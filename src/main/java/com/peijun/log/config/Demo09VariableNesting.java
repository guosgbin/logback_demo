package com.peijun.log.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 变量嵌套
 * 变量的名字、默认值、以及值都可以引用其它的变量。
 * |- 1.嵌套值
 *      一个变量的值可以包含对其它变量的引用。
 *
 * |- 2.名字嵌套
 *      变量的名字可以包含对其它变量的引用。
 *      例如：如果变量 userid=alice，那么 "${${userid}.password}" 就是对变量名为 "alice.passowrd" 的引用。
 *
 * |- 3.默认值嵌套
 *      一个变量的默认值可以引用另一个变量。
 *      例如：假设变量 "id" 没有被定义，变量 "userid" 的值为 "alice"，那么表达式 "${id:-${userid}}" 的值为 "alice"。
 */
public class Demo09VariableNesting {
    final static Logger logger = LoggerFactory.getLogger(Demo09VariableNesting.class);

    public static void main(String[] args) {
        printLog();
    }

    public static void printLog() {
        logger.debug("我是debug信息");
        logger.info("我是info信息");
        logger.warn("我是warn信息");
    }
}
