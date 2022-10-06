import org.jetbrains.annotations.NotNull;

public class Person {
    private final String name;
    private final Integer age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @NotNull
    public String getName() {
        return name;
    }

    @NotNull
    public Integer getAge() {
        return age;
    }
}