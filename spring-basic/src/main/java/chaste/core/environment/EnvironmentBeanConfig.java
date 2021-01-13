package chaste.core.environment;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * @author KChaste Sun
 */
@Configuration
public class EnvironmentBeanConfig {

    // @Profile还支持! & |符号

    @Bean(name = "animal")
    @Profile("dev")
    public Animal animalFirst(){
        Animal animal = new Animal();
        animal.setAnimalName("KChaste Sun first");
        animal.setAge("18");
        return animal;
    }

    @Bean(name = "animal")
    @Profile("test")
    public Animal animalSecond(){
        Animal animal = new Animal();
        animal.setAnimalName("KChaste Sun second");
        animal.setAge("20000");
        return animal;
    }



}
