package july1022;

import java.util.Arrays;


public class july1022 {
    public static void main(String[] args) throws CloneNotSupportedException {

//        Object class methods extended
        //.getClass()
        Doggy dog1 = new Doggy("Alabash", 2, new int[]{1, 2, 3});
//        System.out.println(dog1.getClass());


        //hashCode()
//        july1022.Doggy dog2 = dog1;
//        System.out.println(dog1.equals(dog2));
//        System.out.println(dog1.hashCode()+", "+dog2.hashCode());

        //equals()
//        dog1 = null;
//        System.out.println(dog1.equals(dog1));
//        july1022.Doggy dog2 = dog1;
//        dog2.setAge(2);
//        System.out.println(dog1.equals(dog2));

//        String str1 = "Hello";
//        String str2 = new String("Hello");
//        System.out.println(str1.equals(str2));

        // .clone()
//        july1022.Doggy dog2 = dog1.doggyClone();
//        System.out.println("Dog1: "+dog1.toString());
//        System.out.println("Dog2: "+dog2.toString());
//        dog1.changeArr(5);
//        System.out.println(dog2.getDaysWorked()[0]);

    }
}

class Doggy implements Cloneable {
    private int[] daysWorked;
    private String name;
    private int age;

    Doggy (String name, int age, int[] arr) {
        this.name = name;
        this.age = age;
        this.daysWorked = arr;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int[] getDaysWorked() {
        return daysWorked;
    }

    public void setDaysWorked(int[] daysWorked) {
        this.daysWorked = daysWorked;
    }

    public void changeArr(int x) {
        this.daysWorked[0] = x;
    }





    @Override
    public String toString() {
       return "The dog's name is: "+this.getName()+"\nAge is "+this.getAge()+"\nDays worked: "+ Arrays.toString(this.daysWorked);
    }

}