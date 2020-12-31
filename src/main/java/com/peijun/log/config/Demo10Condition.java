package com.peijun.log.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 开发者通常需要在多个环境中切换配置文件，例如：开发，测试和生产。
 * 这些配置文件有大量相同的地方，只有少数地方不同。
 * 为了避免重复，logback 在配置文件中支持通过 <if>、<then>、<else> 元素作为条件语句来区分不同的环境。
 * 条件处理需要 Janino 环境的支持。
 *
 * <if condition="条件表达式">
 *      <then>
 *          ...
 *      </then>
 * </if>
 *
 * <if condition="条件表达式">
 *      <then>
 *          ...
*       </then>
 *      <else>
 *      ...
 *      </else>
 * </if>
 *
 * 条件表达式只能是上下文变量或者系统变量。
 * 因为值是通过参数传递的，property() 方法或者其等价的 p() 方法属性的值。
 * 例如：如果要获取变量 "k" 的值，可以通过 property("k") 或者 p("k") 来获取。
 * 如果 "k" 没有定义，那么方法将会返回空字符串。所以不需要去判断是否为 null。
 *
 * isDefined() 方法可以用来判断变量是否已经被定义。
 * 例如：可以通过 isDefined("k") 来判断 k 是否已经定义。
 * 还可以通过 isNull() 方法来判断变量是否为 null。例如：isNull("k")。
 */
public class Demo10Condition {
    final static Logger logger = LoggerFactory.getLogger(Demo10Condition.class);

    public static void main(String[] args) {
        printLog();
    }

    public static void printLog() {
        logger.debug("我是debug信息");
        logger.info("我是info信息");
        logger.warn("我是warn信息");
    }
}
