package CodeTest.TestAbstract;

public class TestAbstractClass {
    public static void main(String[] args) {
        Employ employ = new Employ("Franck", 39, "Bank manager");
        employ.displayInfo();
        employ.setName("Boris");
        employ.setAge(45);
        employ.displayInfo();
        System.out.printf("%s \n\n", employ);

        Client client = new Client("Katerin", 25, "Client");
        client.displayInfo();
        System.out.printf("%s \n\n", client);
        System.out.printf("%s \n\n", employ);
    }
}

abstract class Person{
    private String name;
    private int age;

    Person(String name, int age){
        this.name = name;
        this.age = age;
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

    public abstract void displayInfo();
}

class Employ extends Person{
    private String status;
    Employ(String name, int age, String status){
        super(name, age);
        this.status = status;
    }
    public void displayInfo(){
        System.out.printf("Name: %s, age: %d, status: %s\n", super.getName(), super.getAge(), this.status);
    }
}

class Client extends Person{
    private String position;
    Client(String name, int age, String position){
        super(name, age);
        this.position = position;
    }
    public void displayInfo(){
        System.out.printf("Name: %s, age: %d, status: %s\n", super.getName(), super.getAge(), this.position);
    }
}


