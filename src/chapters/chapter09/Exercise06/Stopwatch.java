package chapters.chapter09.Exercise06;

public class Stopwatch {
    private long startTime;
    private long endTime;

    public Stopwatch() {
        this.startTime = System.currentTimeMillis();

    }

    public void start() {
        this.startTime = System.currentTimeMillis();
    }

    public void stop() {
        this.endTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        return getEndTime() - getStartTime();
    }

    public long getEndTime() {
        return this.endTime;
    }

    public long getStartTime() {
        return this.startTime;
    }

}