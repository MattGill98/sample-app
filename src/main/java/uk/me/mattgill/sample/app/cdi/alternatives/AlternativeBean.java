package uk.me.mattgill.sample.app.cdi.alternatives;

import jakarta.enterprise.context.Dependent;
import jakarta.enterprise.inject.Alternative;
import uk.me.mattgill.sample.app.cdi.CustomBean;

/**
 * Used instead of DefaultBean when specified in <alternatives> in beans.xml
 */
@Alternative
@Dependent
public class AlternativeBean extends CustomBean {

}
