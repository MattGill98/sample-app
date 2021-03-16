package uk.me.mattgill.sample.app.cdi.producers;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Produces;
import uk.me.mattgill.sample.app.cdi.CustomBean;

public class ProducerBean {

    @Produces
    @ApplicationScoped
    public CustomBean produceGlobalBean(ProducedBean bean) {
        return bean;
    }

}
