package august3122.io_reference.online.serialization.general;

import java.io.*;

public class SerializationDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException, InterruptedException {
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

class Person implements Serializable {
    @Serial
    private static final long serialVersionUID = -4972394686161425402L;
    String name;
    String surname;
    int age;
    int newField;
    transient String password;
    transient String pin;

    public Person(String name, String surname, int age, String password, String pin) {
        System.out.println("Argument Constructor of Person called");
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.password = password;
        this.pin = pin;
    }

    public Person() {
        System.out.println("No-Argument Constructor of Person called");
        name = "default";
        surname = "default";
        age = 100;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", newField=" + newField +
                ", password='" + password + '\'' +
                ", pin='" + pin + '\'' +
                '}';
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Person objects collected");
    }


    @Serial
    private void writeObject(ObjectOutputStream oos) throws IOException {
        oos.defaultWriteObject();
        oos.writeObject("123" + password);
        oos.writeObject("123" + pin);
    }

    @Serial
    private void readObject(ObjectInputStream ois) throws IOException, ClassNotFoundException {
        ois.defaultReadObject();
        System.out.println("Inside readObject of Person");
        password = ((String) ois.readObject()).substring(3);
        System.out.println("Inside still");
        pin = ((String) (ois.readObject())).substring(3);
    }

    public static int m1() {
        return 0;
    }
}