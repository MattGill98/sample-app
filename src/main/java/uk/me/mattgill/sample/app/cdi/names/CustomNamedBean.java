package uk.me.mattgill.sample.app.cdi.names;

import jakarta.enterprise.context.Dependent;
import jakarta.inject.Named;
import uk.me.mattgill.sample.app.cdi.CustomBean;

@Named("MyNamedBean")
@Dependent
public class CustomNamedBean extends CustomBean {

}
