public class TestThreadTwice1 extends Thread {
    public void run() {
        System.out.println("Sedang Berjalan...");
    }
    public static void main(String[] args) {
        TestThreadTwice t1 = new TestThreadTwice1();
        t1.start();
        t1.start();
    }
}