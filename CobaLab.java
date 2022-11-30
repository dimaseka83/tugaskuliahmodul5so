public class CobaLab extends Thread {
    @Override
    public void run() {
        System.out.println("tread berjalan...");
    }
    public static void main(String[] args) {
        CobaLab t1 = new CobaLab();
        t1.start();
    }
}