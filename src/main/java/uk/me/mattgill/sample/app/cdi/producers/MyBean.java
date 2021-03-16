package uk.me.mattgill.sample.app.cdi.producers;

import java.util.logging.Logger;

import jakarta.inject.Inject;

public class MyBean {

    private static final Logger LOGGER = Logger.getLogger(MyBean.class.getName());

    @Inject
    private Logger logger;

}
