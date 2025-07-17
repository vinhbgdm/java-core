public class TestRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("TestRunnable is running: " + i);
        }
    }
}
