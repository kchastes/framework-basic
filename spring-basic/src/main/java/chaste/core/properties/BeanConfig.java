package chaste.core.properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 *
 * {@link ComponentScan @ComponentScan}(basePackages = "org.example",
 *         includeFilters = @Filter(type = FilterType.REGEX, pattern = ".*Stub.*Repository"),
 *         excludeFilters = @Filter(Repository.class))
 *
 * @author KChaste Sun
 */
@Configuration
@ComponentScan(basePackages = "chaste.core.properties")
@PropertySource("classpath:application.properties")
public class BeanConfig {
    /**
     * 严格@Value判断
     * @return PropertySourcesPlaceholderConfigurer
     */
    @Bean
    public static PropertySourcesPlaceholderConfigurer propertyPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }

}
