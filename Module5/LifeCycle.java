package Module5;

class LifeCycle extends Thread {

    public void run() {
        System.out.println("Thread Running");
    }

    public static void main(String[] args) {

        LifeCycle t = new LifeCycle();

        System.out.println("Thread State: " + t.getState());

        t.start();

        System.out.println("Thread State After Start: " + t.getState());
    }
}
