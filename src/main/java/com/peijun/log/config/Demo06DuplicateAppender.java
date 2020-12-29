package com.peijun.log.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 在默认的情况下，appender 是可以重复使用的
 * logger 可以通过附加到本身的 appender 输出日志，同样的也可以附加到起祖先的身上，并输出日志。
 * 因此，如果同一个 appender 附加到多个 logger 身上，那么就导致日志重复打印。
 *
 *
 * 如果默认的累积行为对你来说不适合，你可以设置 additivity = false。
 */
public class Demo06DuplicateAppender {
    final static Logger logger = LoggerFactory.getLogger(Demo06DuplicateAppender.class);

    public static void main(String[] args) {
        printLog();
    }

    /**
     * 注意日志重复输出了，因为 appender STDOUT 附加到了两个 logger 身上：
     * root 以及 com.peijun.log.config。
     * 因为 root logger 是所有 logger 的祖先
     * 每一次日志请求都会被打印两次，一次是通过 STDO    UT，一次是通过 root。
     *
     * appender 的叠加性并不是为新用户设置的陷阱。它是 logback 非常方便的一个特性。
     * 例如，你可以让系统中所有的日志输出到控制台上，而其它特定的日志输出到特定的 appender 中。
     */
    public static void printLog() {
        logger.debug("我是debug信息");
        logger.info("我是info信息");
        logger.warn("我是warn信息");
    }
}
