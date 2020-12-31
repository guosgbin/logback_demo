package com.peijun.log.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * |- 1
 * logback 支持变量的定义以及替换，变量有它的作用域。
 * 而且，变量可以在配置文件中，外部文件中，外部资源文件中，甚至动态定义。
 *
 * |- 2
 * 属性的作用域分别为本地（local scope）、上下文（context scope）、系统（system scope）。默认为本地作用域。
 *
 * 本地（local scope）：本地范围内的属性存在配置文件的加载过程中。配置文件每加载一次，变量就会被重新定义一次。
 * 上下文（context scope）：上下文范围内的属性会一直存在上下文被清除。
 * 系统（system scope）：系统范围内的属性，会插入到 JVM 的系统属性中，跟随 JVM 一同消亡。
 *
 * 在进行变量替换的时候，会先从本地范围去找，再从上下文去找，再从系统属性中去找，最后会去系统的环境变量中去找。
 *
 * 可以通过 <property>、<define>、<insertFromJNDI> 元素的 scope 属性来设置变量的作用范围。
 * scope 属性可能的值为：local，context，system。如果没有指定，则默认为 local。
 *
 * |- 3
 *  在某些情况下，如果某个变量没有被声明，或者为空，默认值则非常有用
 *  在 bash shell 中，默认值可以通过 ":-" 来指定。
 *  例如：假设变量 myName 没有被定义，"${myName:-peijun}" 会被解释成 "peijun" 。
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
