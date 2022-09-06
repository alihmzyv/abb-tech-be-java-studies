package august3122.io_reference.online.serialization.inheritance;

import java.io.*;

public class SerializationInheritance {
    public static void main(String[] args) throws IOException, ClassNotFoundException, InterruptedException {
        File file  = new File("august/src/main/java/august3122/io_reference/online/file.bin");
        FileOutputStream fileOutputStream = new FileOutputStream(file, false);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        try (objectOutputStream) {
            Student student1 = new Student("Ali", "Hamzayev", 23, "12345", "1234", 1);
            Student student2 = new Student("Mammad", "Mammadov", 22, "abcde", "5678", 2);
            objectOutputStream.writeObject(student1);
            objectOutputStream.writeObject(student2);
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

class Person2 {
    String name;
    String surname;
    int age = 10;
    transient String password;
    transient String pin;

    public Person2(String name, String surname, int age, String password, String pin) {
        System.out.println("Argument constructor of parent class called");
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.password = password;
        this.pin = pin;
    }

    public Person2() {
        System.out.println("No argument constructor of parent class called");
        name = "default";
        surname = "default";
        age = -1;
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
}

class Student extends Person2 implements Serializable {
    int rollID;

    public Student(String name, String surname, int age, String password, String pin, int rollID) {
        super(name, surname, age, password, pin);
        System.out.println("Argument constructor of child class called");
        this.rollID = rollID;
    }

    public Student() {
        System.out.println("No-argument constructor of child class called");
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
        password = ((String) ois.readObject()).substring(3);
        pin = ((String) (ois.readObject())).substring(3);
    }




    @Override
    public String toString() {
        return "Student{" +
                "rollID=" + rollID +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", password='" + password + '\'' +
                ", pin='" + pin + '\'' +
                '}';
    }
}