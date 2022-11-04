package november42022.tasksgiven.builderpattern;

public interface StudentBuilder {
    StudentBuilder setName(String name);

    String getName();

    Student build();
}
