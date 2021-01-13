package chaste.core.environment;

/**
 * @author KChaste Sun
 */
public class Animal {

    private String animalName;
    private String age;

    public Animal(){}

    public Animal(String animalName, String age) {
        this.animalName = animalName;
        this.age = age;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "animalName='" + animalName + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
