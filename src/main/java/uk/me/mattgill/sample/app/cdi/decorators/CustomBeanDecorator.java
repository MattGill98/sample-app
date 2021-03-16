package uk.me.mattgill.sample.app.cdi.decorators;

import java.util.logging.Logger;

import jakarta.annotation.Priority;
import jakarta.decorator.Decorator;
import jakarta.decorator.Delegate;
import jakarta.inject.Inject;
import jakarta.interceptor.Interceptor;
import uk.me.mattgill.sample.app.cdi.CustomBean;

/**
 * Decorates specific bean type, enabled either by <decorators> in beans.xml
 * or @Priority annotation
 */
@Decorator
@Priority(Interceptor.Priority.APPLICATION)
public class CustomBeanDecorator extends CustomBean {

    private static final Logger LOGGER = Logger.getLogger(CustomBeanDecorator.class.getName());

    @Inject
    @Delegate
    private CustomBean delegate;

    @Override
    public Integer getRandomInt() {
        final int result = delegate.getRandomInt();
        LOGGER.info(() -> String.format("Getting random integer. Result: %s", result));
        return result;
    }

}
