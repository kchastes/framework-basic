package lookup;

import chaste.core.lookup.BeanConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author KChaste Sun
 */
public class LookUpTest {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeanConfig.class);
        Object singletonBean = applicationContext.getBean("singletonBean");
        Object singletonBean1 = applicationContext.getBean("singletonBean");
        Object prototypeBean = applicationContext.getBean("prototypeBean");
        Object prototypeBean1 = applicationContext.getBean("prototypeBean");
        System.out.println("singletonBean = " + singletonBean);
        System.out.println("singletonBean1 = " + singletonBean1);
        System.out.println("prototypeBean = " + prototypeBean);
        System.out.println("prototypeBean1 = " + prototypeBean1);

    }

}
