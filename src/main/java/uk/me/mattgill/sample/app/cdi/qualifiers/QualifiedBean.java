package uk.me.mattgill.sample.app.cdi.qualifiers;

import jakarta.enterprise.context.Dependent;
import uk.me.mattgill.sample.app.cdi.CustomBean;

@Dependent
@MyQualifier
public class QualifiedBean extends CustomBean {

}
