package uk.me.mattgill.sample.app.cdi.types;

import jakarta.enterprise.context.Dependent;
import jakarta.enterprise.inject.Typed;
import uk.me.mattgill.sample.app.cdi.CustomBean;

@Dependent
@Typed(MyInterface.class)
public class TypedBean extends CustomBean implements MyInterface {

}
