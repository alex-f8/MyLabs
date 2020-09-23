package CodeTest.TestInterfaces;

public class TestInterface {
    public static void main(String[] args) {
        Car car = new Car("Porsche", "Yellow");
        car.printModel();
        car.color();
        car.printAllModel();
        System.out.println(car.hashCode());
/*        Car machine = car.clone();
        System.out.println(machine.hashCode());*/
        System.out.println(Transport.sum(5, 10 , 1, 3, 6, 8));

    }
}

interface Transport{
    String model = "Transport"; // C O N S T A N T  ! ! !
    int KOLESA = 4;

    default void printModel(){
        System.out.println(this.model);
    }

    void color();

    // static interface method ! ! !
    static int sum(int ...i){
        int sum = 0;
        for(int k : i)
            sum += k;
        return sum;
    }
}

class Car implements Transport{
    private String model1;
    private String color;
    Car(String model, String color){
        this.model1 = model;
        this.color = color;
    }
    public void color(){
        System.out.println(this.color);
    }
    public void printAllModel(){
        System.out.printf("model: %s, model1: %s, color: %s", model, model1, color);
    }

/*    //other test
    public Car clone(){
        return super.clone();
    }*/
}

