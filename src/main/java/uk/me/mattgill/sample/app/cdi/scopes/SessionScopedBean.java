package uk.me.mattgill.sample.app.cdi.scopes;

import java.io.Serializable;

import jakarta.enterprise.context.SessionScoped;
import uk.me.mattgill.sample.app.cdi.CustomBean;

/**
 * Needs to be serialisable
 */
@SessionScoped
public class SessionScopedBean extends CustomBean implements Serializable {

    private static final long serialVersionUID = 1L;

}
