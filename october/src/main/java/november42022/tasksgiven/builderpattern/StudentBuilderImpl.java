package november42022.tasksgiven.builderpattern;

public class StudentBuilderImpl implements StudentBuilder {
    private String name;

    public StudentBuilderImpl setName(String name) {
        this.name = name;
        return this;
    }

    public Student build() {
        return new Student(this);
    }

    public String getName() {
        return this.name;
    }
}
