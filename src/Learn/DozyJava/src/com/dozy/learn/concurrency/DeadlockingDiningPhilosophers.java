//: concurrency/DeadlockingDiningPhilosophers.java
package com.dozy.learn.concurrency;

// Demonstrates how deadlock can be hidden in a program.
// {Args: 0 5 timeout}
import java.util.concurrent.*;

public class DeadlockingDiningPhilosophers {
    public static void main(String[] args) throws Exception {
        String[] argx = { "0", "5", "timeout" };

        int ponder = 5;
        if (argx.length > 0)
            ponder = Integer.parseInt(argx[0]);
        int size = 5;
        if (argx.length > 1)
            size = Integer.parseInt(argx[1]);
        ExecutorService exec = Executors.newCachedThreadPool();
        Chopstick[] sticks = new Chopstick[size];
        for (int i = 0; i < size; i++)
            sticks[i] = new Chopstick();
        for (int i = 0; i < size; i++)
            exec.execute(new Philosopher(sticks[i], sticks[(i + 1) % size], i,
                    ponder));
        if (argx.length == 3 && argx[2].equals("timeout"))
            TimeUnit.SECONDS.sleep(1);
        else {
            System.out.println("Press 'Enter' to quit");
            System.in.read();
        }
        exec.shutdownNow();
    }
} /* (Execute to see output) */// :~
