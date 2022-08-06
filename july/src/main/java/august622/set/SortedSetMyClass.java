package august622.set;

import java.util.*;

public class SortedSetMyClass {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Vali", 1);
        Employee employee2 = new Employee("Vali", 2);
        List<Employee> employeeList = Arrays.asList(employee1, employee2);

        TreeSet<Employee> employeeTreeSet = new TreeSet<>(new MyComparator()); //compareTo
        employeeTreeSet.addAll(employeeList);
        System.out.println(employeeTreeSet);
    }
}

class MyComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) { //by names alphabetical order
        int result = o1.getName().compareTo(o2.getName());
        if (result == 0) { //same name
            result = o1.compareTo(o2); //compare by ID's then
        }

        return result;
    }
}

class Employee implements Comparable<Employee>{
    private String name;
    private int ID;

    public Employee(String name, int ID) {
        this.name = name;
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }


    @Override
    public int compareTo(Employee o) { //compare by ID (ID's cant be the same for non-dublicate employees)
        return this.ID - o.ID;
    }

    @Override
    public String toString() {
        return String.format("ID: %d, Name: %s", ID, name);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return ID == employee.ID && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, ID);
    }
}