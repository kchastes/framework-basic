package chaste.core.lookup;


import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * @author KChaste Sun
 */
@Component
public class SingletonBean {

    /**
     * 通过ApplicationContext每次获取对象,耦合在一起了.
     * private ApplicationContext applicationContext
     */
    private PrototypeBean prototypeBean;

    public SingletonBean(ApplicationContext applicationContext){
        //this.applicationContext = applicationContext;
        this.prototypeBean = getPrototypeBean();
    }

    /**
     * look会生成代理.
     * @return PrototypeBean实例
     */
    @Lookup
    public PrototypeBean getPrototypeBean() {
        return prototypeBean;
    }
    public void setPrototypeBean(PrototypeBean prototypeBean) {
        this.prototypeBean = prototypeBean;
    }

    @Override
    public String toString() {
        return "SingletonBean{" +
                "prototypeBean=" + getPrototypeBean() +
                '}';
    }
}
