package uk.me.mattgill.sample.app.cdi.scopes;

import java.io.Serializable;

import jakarta.enterprise.context.Conversation;
import jakarta.enterprise.context.ConversationScoped;
import jakarta.inject.Inject;
import uk.me.mattgill.sample.app.cdi.CustomBean;

/**
 * Acts as request scoped until the conversation is marked as long-running
 * (begin).
 */
@ConversationScoped
public class ConversationScopedBean extends CustomBean implements Serializable {

    private static final long serialVersionUID = 1L;

    @Inject
    private Conversation conversation;

    public void start() {
        if (conversation.isTransient()) {
            conversation.begin();
        }
    }

    public void stop() {
        if (!conversation.isTransient()) {
            conversation.end();
        }
    }

}
