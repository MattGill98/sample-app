package uk.me.mattgill.sample.app.cdi.alternatives;

import jakarta.enterprise.context.Dependent;
import jakarta.enterprise.inject.Specializes;
import uk.me.mattgill.sample.app.cdi.CustomBean;

/**
 * Alternative won't always be injected if the alternative doesn't contain all
 * qualifiers on the replaced bean. In this case, the @Specializes replaces the
 * bean when specified in the <alternatives> of the beans.xml
 */
@Specializes
@Dependent
public class SpecialisesBean extends CustomBean {

}
