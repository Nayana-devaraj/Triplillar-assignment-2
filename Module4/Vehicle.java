package Module4;

interface Vehicle {
    void start();
}

class Car implements Vehicle {
    public void start() {
        System.out.println("Car is starting");
    }

    public static void main(String[] args) {
        Car c = new Car();
        c.start();
    }
}
