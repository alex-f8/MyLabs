package CodeTest;

/* super() and this() very good test*/

 class Parent{
    Parent(){
        System.out.println("helo from Parent");
    }
    Parent(int i){
        System.out.println("hello from Parent x" + i);
    }
}

class Child extends Parent{
    Child(){
        this(5);
        System.out.println("hello from Child");
    }
    Child(int i){
        super(i);
        System.out.println("hello from Child " + i);
    }
}

public class TestParentChildQuickTest {
    public static void main(String[] args) {
        Child child = new Child();
        System.out.println("hellow from main");
    }
}
