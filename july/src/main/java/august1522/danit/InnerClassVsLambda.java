package august1522.danit;

public class InnerClassVsLambda {
    public static void main(String[] args) {
//        List<Employee> employees = new ArrayList<>(Arrays.asList(new Employee("ab"), new Employee("bc"), new Employee("d"),
//        new Employee("cdeeef"), new Employee("f"), new Employee("e")));
//        Collections.sort(employees, Comparator.comparingInt((Employee e) -> -e.name.length()).thenComparing(e -> e.name));
//        System.out.println(employees);
        //creating thread using anonymous class
//        Runnable runnable = new Runnable() {//InnerClassVsLambda$1 (anonymous inner class of InnerClassVsLambda, implementing Runnable I
//            @Override
//            public void run() {
//                for (int i = 0; i < 10; i++) {
//                    System.out.println("Thread created using Anonymous class");
//                }
//                System.out.println(this.getClass().getName()); //InnerClassVsLambda$1
//            }
//        };
//
//        //creating thread using lambda expression
//        Runnable runnable1 = () -> { //no inner class created
//            for (int i = 0; i < 10; i++) {
//                System.out.println("Thread created using lambda expression");
//            }
//        };
//        new Thread(runnable).start();
//        new Thread(runnable1).start();
    }
}

class Employee implements Comparable<Employee>{
    String name;
    private static int countEmployees = 1;
    int ID;

    public Employee(String name) {
        this.name = name;
        this.ID = countEmployees++;
    }

    @Override
    public String toString() {
        return String.format("Name: %s, ID: %d", name, ID);
    }

    @Override
    public int compareTo(Employee o) {
        return this.ID - o.ID;
    }
}