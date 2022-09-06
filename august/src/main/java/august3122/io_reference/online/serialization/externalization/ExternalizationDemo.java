package august3122.io_reference.online.serialization.externalization;

import java.io.*;

public class ExternalizationDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File file  = new File("august/src/main/java/august3122/io_reference/online/file.bin");
        FileOutputStream fileOutputStream = new FileOutputStream(file, false);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        try (objectOutputStream) {
            Person person1 = new Person("Ali", "Hamzayev", 23, "12345", "1234");
            Person person2 = new Person("Mammad", "Mammadov", 22, "abcde", "5678");
            objectOutputStream.writeObject(person1);
            objectOutputStream.writeObject(person2);
        }

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));
        try (objectInputStream) {
            while (true) {
                try {
                    System.out.println(objectInputStream.readObject());
                }
                catch (EOFException exc) {
                    System.out.println("Finished");
                    break;
                }
            }
        }
    }
}

class Person implements Externalizable {
    String name;
    String surname;
    int age;
    transient String password;
    transient String pin;

    public Person(String name, String surname, int age, String password, String pin) {
        System.out.println("Argument constructor called");
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.password = password;
        this.pin = pin;
    }

    public Person() {
        System.out.println("No-argument constructor called");
        age = 100;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", password='" + password + '\'' +
                ", pin='" + pin + '\'' +
                '}';
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Person objects collected");
    }


    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(name);
        out.writeObject(surname);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        //no-argument constructor called
        name = (String) in.readObject();
        System.out.println("After default constructor call");
        surname = (String) in.readObject();
    }
}