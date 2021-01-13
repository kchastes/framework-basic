package chaste.core.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author KChaste Sun
 */
@Component
public class PropertiesValue {

    private String name;
    public PropertiesValue(@Value("${aa.name}") String name){
        this.name = name;
    }
    @PostConstruct
    public void populateMovieCache() {
        System.out.println("init");
    }

    @PreDestroy
    public void clearMovieCache() {
        System.out.println("destroy");
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "PropertiesValue{" +
                "name='" + name + '\'' +
                '}';
    }
}
