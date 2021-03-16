package uk.me.mattgill.sample.app.cdi.interceptors;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import jakarta.interceptor.InterceptorBinding;

@InterceptorBinding
@Inherited
@Target(TYPE)
@Retention(RUNTIME)
public @interface CustomInterceptorBinding {

}
