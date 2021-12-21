package javapractice.multithreading;

import java.util.*;
import java.util.concurrent.*;

public class SprintRaceWithCyclicBarrier {
    public static void main(String[] args) {
        Map<String, SprintRace> map = new ConcurrentHashMap<>();
        ThreadLocalRandom random = ThreadLocalRandom.current();
        CyclicBarrier cyclicBarrier = new CyclicBarrier(11);
        CountDownLatch countDownLatch = new CountDownLatch(10);
        String participantName = "Participant-";
        Collection<Thread> threadCollection = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            threadCollection.add(new Thread(new Participant(random, participantName + i, cyclicBarrier, map,countDownLatch)));
        }
        Iterator<Thread> iterator = threadCollection.iterator();
        while (iterator.hasNext()) {
            iterator.next().start();
        }
        while (cyclicBarrier.getNumberWaiting() < 11 && cyclicBarrier.getNumberWaiting()>0) {
            try {
                if (cyclicBarrier.getNumberWaiting() == 10) {
                    cyclicBarrier.await();
                }

            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (BrokenBarrierException e) {
                e.printStackTrace();
            }
        }
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Race completed!!!!!!!!!!!!!");

        System.out.println(" -------------Below are the stats-------------");

        for (Map.Entry<String, SprintRace> entry : map.entrySet()) {
            System.out.println("<<<<----------Participant---------->>>>>");
            System.out.println("Participant Name----> " + entry.getKey());
            System.out.println(entry.getValue().toString());
        }
    }

    static class Participant implements Runnable {
        private ThreadLocalRandom random;
        private String name;
        private CyclicBarrier cyclicBarrier;
        private SprintRace race;
        private Map<String, SprintRace> map;
        private CountDownLatch countDownLatch;

        public Participant(ThreadLocalRandom random, String name, CyclicBarrier cyclicBarrier, Map<String, SprintRace> map,CountDownLatch countDownLatch) {
            this.random = random;
            this.name = name;
            this.cyclicBarrier = cyclicBarrier;
            race = new SprintRace(name);
            this.map = map;
            this.countDownLatch=countDownLatch;
        }

        @Override
        public void run() {
            try {
                cyclicBarrier.await();
                this.race.setStartTime(System.currentTimeMillis());
                System.out.println(" Starting the race::" + name);

                Thread.sleep(random.nextLong(1000, 5000));


                this.race.setEndTime(System.currentTimeMillis());
                this.map.put(name, this.race);

                System.out.println("Finished race::" + name);
                countDownLatch.countDown();

            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (BrokenBarrierException e) {
                e.printStackTrace();

            }
        }
    }
}

class SprintRace {
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


