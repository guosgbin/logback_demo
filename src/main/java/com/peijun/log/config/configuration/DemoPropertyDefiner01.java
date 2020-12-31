package com.peijun.log.config.configuration;

import ch.qos.logback.core.PropertyDefinerBase;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * https://stackoverflow.com/questions/11370666/how-to-implement-propertydefiner-for-logback-to-access-multiple-properties
 * shape 这些拿不出来
 *
 *
 * 目前，logback 已经有了几个简单的实现类：
 *
 * 类名	描述
 * CanonicalHostNamePropertyDefiner	将变量的值设置为本地的主机名。注意：获取主机名可能需要花费几秒的时间。
 * FileExistsPropertyDefiner	如果通过 path 属性指定的文件存在，则设置变量为 "true"，否则设置为 "false"。
 * ResourceExistsPropertyDefiner	如果通过 resource 属性指定的资源文件在类路径中存在，则设置变量为 "true"，否则设置为 "false"。
 */
public class DemoPropertyDefiner01 extends PropertyDefinerBase {

    private static final Logger LOG = LoggerFactory.getLogger(DemoPropertyDefiner01.class);

    private static String rootLevel = "info";

    private String shape;

    private String color;

    private Integer size;


    /**
     * 返回需要生成的值，本例中是返回 日志级别
     */
    @Override
    public String getPropertyValue() {
        return rootLevel;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }
}
