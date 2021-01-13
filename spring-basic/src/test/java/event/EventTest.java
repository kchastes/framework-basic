package event;

import chaste.core.event.EmailService;
import chaste.core.event.EventConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author KChaste Sun
 */
public class EventTest {


    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(EventConfig.class);
        applicationContext.getResource("");
        EmailService emailService = applicationContext.getBean("emailService", EmailService.class);
        emailService.sendEmail("123@email.com","email message");
    }

}
