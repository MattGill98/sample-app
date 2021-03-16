package uk.me.mattgill.sample.app.cdi.stereotypes;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import jakarta.ejb.Asynchronous;
import jakarta.enterprise.context.RequestScoped;
import jakarta.enterprise.inject.Stereotype;

@RequestScoped
@Asynchronous
@Stereotype
@Target(TYPE)
@Retention(RUNTIME)
public @interface Action {
}