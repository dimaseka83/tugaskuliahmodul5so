public class TestCallStart2 extends Thread {
    public void run() {
        for (int i = 1; i < 5; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        TestCallStart2 t1 = new TestCallStart2();
        TestCallStart2 t2 = new TestCallStart2();
        t1.start();
        t2.start();
    }
}