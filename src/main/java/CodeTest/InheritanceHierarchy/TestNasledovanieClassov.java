package CodeTest.InheritanceHierarchy;

public class TestNasledovanieClassov {
    public static void main(String[] args) {
        Object fl = new Flower("Tulip");
        if(fl instanceof Flower){
            System.out.printf("object %s is created from class %s\n",
                    ((Flower) fl).getFlowerName(), ((Flower) fl).getClassName());
            /* ! ! !
            ((Flower)f).* converts object from class Object converts to
            object from class Flower
            */
        }
        System.out.println(fl.hashCode());
        System.out.println(((Flower)fl).hashCode());
        System.out.println(System.out.getClass());
    }
}

class Flower{
    private String className = "Flower";
    private String flowerName;
    Flower(String name){
        this.flowerName = name;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getFlowerName() {
        return flowerName;
    }

    public void setFlowerName(String flowerName) {
        this.flowerName = flowerName;
    }
}
