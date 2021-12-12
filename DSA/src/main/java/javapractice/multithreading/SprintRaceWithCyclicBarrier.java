package javapractice.multithreading;

import java.util.Map;
import java.util.Objects;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ThreadLocalRandom;

public class SprintRaceWithCyclicBarrier {
    public static void main(String[] args) {
        Map<String,SprintRace> map=new ConcurrentHashMap<>();
        ThreadLocalRandom random=ThreadLocalRandom.current();

    }

    static class Participant implements Runnable{
        private ThreadLocalRandom random;
        private String name;
        private CyclicBarrier cyclicBarrier;

        @Override
        public void run() {
            try {
                cyclicBarrier.await();

                 System.out.println(" Starting the race");

                Thread.sleep(random.nextLong());

                cyclicBarrier.await();

            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (BrokenBarrierException e) {
                e.printStackTrace();

            }
        }
    }
}

class SprintRace{
    private String name;
    private Long startTime;
    private Long endTime;

    public SprintRace(String name) {
        this.name = name;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SprintRace that = (SprintRace) o;
        return name.equals(that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "SprintRace{" +
                "name='" + name + '\'' +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                '}';
    }
}


