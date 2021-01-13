package environment;

import chaste.core.environment.EnvironmentBeanConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

/**
 * @author KChaste Sun
 */
public class EnvironmentBeanTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        applicationContext.getEnvironment().setActiveProfiles("dev","test");

        applicationContext.register(EnvironmentBeanConfig.class);
        applicationContext.refresh();

        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        System.out.println(Arrays.toString(beanDefinitionNames));

        Object animal = applicationContext.getBean("animal");
        System.out.println("animal = " + animal);

        // 添加自定义PropertySource
        /*
        ConfigurableApplicationContext ctx = new GenericApplicationContext();
        MutablePropertySources sources = ctx.getEnvironment().getPropertySources();
        sources.addFirst(new MyPropertySource());
        */

    }

}
