package com.peijun.log.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Gang {
    static final Logger logger = LoggerFactory.getLogger(Gang.class);

    public void doIt() {
        logger.debug("Did it again!");
    }
}
