public class WaitAndPrint implements Runnable {
    private int i;
    private int waitSeconds;

    WaitAndPrint(int i, int waitSeconds) {
        this.i = i;
        this.waitSeconds = waitSeconds;
    }

    public void run() {
        try {
            Thread.sleep(this.waitSeconds * 1000);
            System.out.println("WaitAndPrint object #" + this.i +" on thread " + Thread.currentThread().getId());
        } catch (InterruptedException ignore) {}
    }
}
