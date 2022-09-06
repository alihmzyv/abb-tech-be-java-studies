package august3122.io_reference.danit;

import java.io.*;

public class Demo {
    public static void main(String[] args) throws IOException {
        File file = new File("august/src/main/java/august3122/io_reference/danit/output.bin");
        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        try (oos) {
            Human human1 = new Human("Mammad", "Mammadov", 25, "Pssm123$$54PSssm");
            oos.writeObject(human1);
        }

    }
}

class Human implements Externalizable {
    private String name;
    private String surname;
    private int age;
    private String pwrd;

    public Human(String name, String surname, int age, String pwrd) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.pwrd = pwrd;
    }

    public Human() {
        pwrd = "XXX";
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeUTF(name);
        out.writeUTF(surname);
        out.writeInt(age);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        name = in.readUTF();
        surname = in.readUTF();
        age = in.readInt();
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", pwrd='" + pwrd + '\'' +
                '}';
    }
}
