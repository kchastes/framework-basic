package chaste.core.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

/**
 * @author KChaste Sun
 */
public class PersonValidator implements Validator {


    /**
     * 验证器是否可以验证提供的类实例
     * @param clazz 对应的类实例
     * @return true or false
     */
    @Override
    public boolean supports(Class<?> clazz) {
        return Person.class.equals(clazz);
    }

    /**
     * 验证给定的对象，如果验证错误，将其注册到给定的errors对象中
     * @param target 需要验证的对象
     * @param errors 错误对象
     */
    @Override
    public void validate(Object target, Errors errors) {
        ValidationUtils.rejectIfEmpty(errors, "name", "name.empty");
        Person p = (Person) target;
        if (p.getAge() < 0) {
            errors.rejectValue("age", "negativevalue");
        } else if (p.getAge() > 110) {
            errors.rejectValue("age", "too.darn.old");
        }
    }
}
