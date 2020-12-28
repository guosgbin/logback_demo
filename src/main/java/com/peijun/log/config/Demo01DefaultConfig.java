package com.peijun.log.config;

import ch.qos.logback.classic.BasicConfigurator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 配置logback
 *
 * 以下是 logback 的初始化步骤：
 *
 * 下面寻找文件的循序 各个版本可能不一样，以实际版本为主
 *
 * logback 会在类路径下寻找名为 logback-test.xml 的文件。
 *   如果没有找到，logback 会继续寻找名为 logback.groovy 的文件。
 *   如果没有找到，logback 会继续寻找名为 logback.xml 的文件。
 *   如果没有找到，将会通过 JDK 提供的 ServiceLoader 工具在类路径下寻找文件
 *      META-INFO/services/ch.qos.logback.classic.spi.Configurator，该文件的内容为实现了 Configurator 接口的实现类的全限定类名。
 *   如果以上都没有成功，logback 会通过 BasicConfigurator 为自己进行配置，并且日志将会全部在控制台打印出来。
 *   最后一步的目的是为了保证在所有的配置文件都没有被找到的情况下，提供一个默认的（但是是非常基础的）配置。
 *
 * 如果你使用的是 maven，你可以在 src/test/resources 下新建 logback-test.xml。maven 会确保它不会被生成。
 * 所以你可以在测试环境中给配置文件命名为 logback-test.xml，在生产环境中命名为 logback.xml。
 */
public class Demo01DefaultConfig {
    final static Logger logger = LoggerFactory.getLogger(Demo01DefaultConfig.class);

    /**
     * {@link BasicConfigurator}
     */
    public static void main(String[] args) {
        logger.info("进入项目.");
        logger.debug("项目运行中...");
        logger.info("退出项目");
    }
}
