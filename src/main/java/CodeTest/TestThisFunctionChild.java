package CodeTest;


import CodeTest.PackTestThisFunction.TestThisFunctionParent;

public class TestThisFunctionChild extends TestThisFunctionParent {
    TestThisFunctionChild(){
        //super();
        this("Hello from RELOADED Child");
        //this();
        System.out.println("hello from child");

    }

    TestThisFunctionChild(String s){
        System.out.println(s);
    }

}
