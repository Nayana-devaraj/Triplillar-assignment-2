package Module4;

public class GarbageDemo {

    public void finalize() {
        System.out.println("Garbage Collected");
    }

    public static void main(String[] args) {
        GarbageDemo obj1 = new GarbageDemo();
        GarbageDemo obj2 = new GarbageDemo();

        obj1 = null;
        obj2 = null;

        System.gc();
    }
}
