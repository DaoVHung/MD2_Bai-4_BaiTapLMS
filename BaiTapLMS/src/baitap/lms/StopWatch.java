package baitap.lms;

public class StopWatch {
    private long startTime;
    private long endTime;
    private boolean running = true;

    public void start() {
        this.startTime = System.currentTimeMillis();
        running = true;
    }

    public void stop() {
        this.endTime = System.currentTimeMillis();
        running = false;
    }

    public long getElapsedTime() {
        long elapesed;
        if (running) {
            elapesed = (System.currentTimeMillis() - startTime);
        } else {
            elapesed = (endTime - startTime);
        }return elapesed;

    }




}
