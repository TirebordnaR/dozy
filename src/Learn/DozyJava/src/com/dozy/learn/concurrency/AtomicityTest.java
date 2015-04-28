//: concurrency/AtomicityTest.java
package com.dozy.learn.concurrency;

import java.util.concurrent.*;

public class AtomicityTest implements Runnable {
    private int i = 0;
    private static boolean cancel = false;
    public void cancelTask() {
        cancel = true;
    }

    public int getValue() {
        return i;
    }

    private synchronized void evenIncrement() {
        i++;
        i++;
    }

    public void run() {
        while (true) {
            if (cancel) {
                break;
            }
            evenIncrement();
        }
    }

    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        AtomicityTest at = new AtomicityTest();
        exec.execute(at);
        while (true) {
            int val = at.getValue();
            if (val % 2 != 0) {
                at.cancelTask();
                System.out.println(val);
                break;
            }
        }
        exec.shutdown();
    }
} /*
   * Output: (Sample) 191583767
   */// :~
