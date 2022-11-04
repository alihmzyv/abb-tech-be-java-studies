package november42022.tasksgiven.builderpattern;

public class BuilderPatternDemo {
    public static void main(String[] args) {
        StudentBuilder studentBuilder = new StudentBuilderImpl();
        Student std = studentBuilder
                            .setName("Ali")
                            .build();
        System.out.println(std);
    }
}
