package uk.me.mattgill.sample.app.cdi.scopes;

import jakarta.enterprise.context.RequestScoped;
import uk.me.mattgill.sample.app.cdi.CustomBean;

@RequestScoped
public class RequestScopedBean extends CustomBean {

}
