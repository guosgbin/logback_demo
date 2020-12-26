package com.peijun.log.starter;

import ch.qos.logback.classic.Level;
import org.slf4j.LoggerFactory;

/**
 *
 * logback 允许日志在多个地方进行输出。
 * 站在 logback 的角度来说，输出目的地叫做 appender。
 * appender 包括console、file、remote socket server、MySQL、PostgreSQL、Oracle
 * 或者其它的数据库、JMS、remote UNIX Syslog daemons 中。
 *
 * 一个 logger 可以有多个 appender。
 *
 * 例如：如果 root logger 添加了一个 console appender，所有允许输出的日志至少会在控制台打印出来。
 * 如果再给一个叫做 L 的 logger 添加了一个 file appender，那么 L 以及 L 的子级 logger 都可以在文件和控制台打印日志。
 * 可以通过设置 additivity = false 来改写默认的设置，这样 appender 将不再具有叠加性。
 *
 *
 */
public class StarterDemo03 {
    public static void main(String[] args) {

        ch.qos.logback.classic.Logger logger =
                (ch.qos.logback.classic.Logger) LoggerFactory.getLogger("com.peijun");

//        logger.setLevel(Level.WARN);
        logger.setLevel(Level.DEBUG);
        logger.setLevel(Level.TRACE);
        int i = 100;

        /*
         * 在这种情况下，如果 logger没有开启 debug 模式，不会有构建参数带来的性能损耗。
         * 换句话说，如果 logger 在 debug 级别，将会有两次性能的损耗，
         * 一次是判断是否启用了 debug 模式，一次是打印 debug 日志。
         *
         * 在实际应用当中，这种性能上的损耗是可以忽略不计的，因为它所花费的时间小于打印一条日志的时间的 1%。
         */
        if(logger.isDebugEnabled()) {
            logger.debug("Entry number: " + i + " is sb");
        }

        /*
         * 有一种更好的方式去格式化日志信息。假设 entry 是一个 Object 对象：
         *
         * Object entry = new SomeObject();
         * logger.debug("The entry is {}", entry);
         * 只有在需要打印 debug 信息的时候，才会去格式化日志信息，将 '{}' 替换成 entry 的字符串形式。
         * 也就是说在这种情况下，如果禁止了日志的打印，也不会有构建参数上的性能消耗。
         *
         * 下面两行输出的结果是一样的，但是一旦禁止日志打印，第二个变量的性能至少比第一个变量好上 30 倍。
         *
         * logger.debug("The new entry is " + entry + ".");
         * logger.debug("The new entry is {}", entry);
         * 使用两个参数的例子如下：
         *
         * logger.debug("The new entry is {}, It replaces {}.", entry, oldEntry);
         * 如果需要使用三个或三个以上的参数，可以采用如下的形式：
         *
         * Object[] paramArray = {newVal, below, above};
         * logger.debug("Value {} was inserted between {} and {}.", paramArray);
         */

    }
}
