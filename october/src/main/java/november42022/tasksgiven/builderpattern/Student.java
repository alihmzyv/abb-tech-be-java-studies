package november42022.tasksgiven.builderpattern;

public class Student {
    private String name;

    public Student(StudentBuilder studentBuilder) {
        name = studentBuilder.getName();
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}
