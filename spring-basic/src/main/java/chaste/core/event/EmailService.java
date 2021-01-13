package chaste.core.event;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author KChaste Sun
 */
@Component
public class EmailService implements ApplicationEventPublisherAware {

    private ApplicationEventPublisher publisher;


    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.publisher = applicationEventPublisher;
    }

    public void sendEmail(String address,String content){
        // 类似邮件过滤
        if ("123@email.com".equals(address)){
            // 事件发布 同步的,会阻塞直到所有监听器完成,好处就是能在发布者的事务上下文中进行.
            publisher.publishEvent(new BlockedListEvent(this,address,content));
            publisher.publishEvent(new BlockedListEvent(this,address,content));
        }
        // send email
    }

}
