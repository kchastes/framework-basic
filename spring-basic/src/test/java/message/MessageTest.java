package message;

import chaste.core.message.MessageConfig;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Locale;

/**
 * @author KChaste Sun
 */
public class MessageTest {

    public static void main(String[] args) {
        MessageSource messageSource = new AnnotationConfigApplicationContext(MessageConfig.class);
        String message = messageSource.getMessage("name", null, "default message", Locale.CHINA);
        System.out.println(message);

    }

}
