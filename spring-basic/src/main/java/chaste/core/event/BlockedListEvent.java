package chaste.core.event;

import org.springframework.context.ApplicationEvent;
import org.springframework.stereotype.Component;

/**
 * @author KChaste Sun
 */
public class BlockedListEvent extends ApplicationEvent {

    private final String address;
    private final String content;

    /**
     * Create a new {@code ApplicationEvent}.
     *
     * @param source the object on which the event initially occurred or with
     *               which the event is associated (never {@code null})
     */
    public BlockedListEvent(Object source,String address,String content) {
        super(source);
        this.address = address;
        this.content = content;
    }
    public String getAddress() {
        return address;
    }

    public String getContent() {
        return content;
    }
}
