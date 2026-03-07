package Module5;

class MyRunnable implements Runnable {

    public void run() {
        System.out.println("Thread using Runnable");
    }

    public static void main(String[] args) {
        MyRunnable obj = new MyRunnable();
        Thread t = new Thread(obj);
        t.start();
    }
}