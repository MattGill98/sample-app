package uk.me.mattgill.sample.app.cdi.events;

import java.util.logging.Logger;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.event.Observes;

@ApplicationScoped
public class CustomEventReceiver {

    private static final Logger LOGGER = Logger.getLogger(CustomEventReceiver.class.getName());

    private int eventsReceived = 0;
    private int adminEventsReceived = 0;

    public void observeNormalEvent(@Observes CustomEvent event) {
        LOGGER.info("Observed normal event: " + event.getValue());
        eventsReceived++;
    }

    public void observeAdminEvent(@Observes @Admin CustomEvent event) {
        LOGGER.info("Observed admin event: " + event.getValue());
        adminEventsReceived++;
    }

    public int getEventsReceived() {
        return eventsReceived;
    }

    public int getAdminEventsReceived() {
        return adminEventsReceived;
    }

}
