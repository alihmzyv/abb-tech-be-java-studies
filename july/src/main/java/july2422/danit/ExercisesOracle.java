package july2422.danit;

public class ExercisesOracle {
    public static void main(String args[]) {
        Car car1 = new Car(1);
        Car car2 = new Car(2);
        Car car3 = new Car(3);
        car1 = null;
        car2 = null;
        car3 = null;
        System.gc();

        for (int i = 0; i < 1000; i++) {
            System.out.println("Waiting..");
        }
    }
}

class Car {
    int number;

    public Car(int i) {
        number = i;
    }

    @Override
    protected void finalize() {
        System.out.println("Car " + this.number + " destroyed");
    }
}
