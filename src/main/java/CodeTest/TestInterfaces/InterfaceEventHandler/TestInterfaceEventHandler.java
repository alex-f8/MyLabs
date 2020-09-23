package CodeTest.TestInterfaces.InterfaceEventHandler;

public class TestInterfaceEventHandler {
    public static void main(String[] args) {
        Button button = new Button(new ButtonClickHandler());
        button.click();
        button.click();
        button.click();
    }
}

interface EventHandler{
    void execute();
}

class ButtonClickHandler implements EventHandler{
    public void execute(){
        System.out.println("Button clicked!");
    }
}

class Button{
    EventHandler handler;
    Button(EventHandler action){
        this.handler = action;
    }
    public void click(){
        handler.execute();
    }
}