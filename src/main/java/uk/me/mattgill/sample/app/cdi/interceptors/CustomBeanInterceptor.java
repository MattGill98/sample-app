package uk.me.mattgill.sample.app.cdi.interceptors;

import java.io.Serializable;
import java.util.logging.Logger;

import jakarta.annotation.Priority;
import jakarta.interceptor.AroundConstruct;
import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;

/**
 * Intercepts specific bean type, enabled either by <interceptors> in beans.xml
 * or @Priority annotation
 */
@Interceptor
@CustomInterceptorBinding
@Priority(Interceptor.Priority.APPLICATION)
public class CustomBeanInterceptor implements Serializable {

    private static final long serialVersionUID = 1L;

    private static final Logger LOGGER = Logger.getLogger(CustomBeanInterceptor.class.getName());

    @AroundInvoke
    public Object logMethodEntry(InvocationContext invocationContext) throws Exception {
        final Object result = invocationContext.proceed();
        LOGGER.info(() -> String.format("Invoking custom bean method %s. Result: %s",
                invocationContext.getMethod().getName(), result));
        return result;
    }

    @AroundConstruct
    public Object logBeanCreation(InvocationContext invocationContext) throws Exception {
        final Object result = invocationContext.proceed();
        LOGGER.info(() -> String.format("Custom bean constructed: %s", result));
        return result;
    }

}
