package properties;

import chaste.core.properties.BeanConfig;
import chaste.core.properties.PropertiesValue;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author KChaste Sun
 */
public class ConfigTest {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeanConfig.class);
        PropertiesValue propertiesValue = applicationContext.getBean("propertiesValue", PropertiesValue.class);
        System.out.println(propertiesValue);
    }

}
