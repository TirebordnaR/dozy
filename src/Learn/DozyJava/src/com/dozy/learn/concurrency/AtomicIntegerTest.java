//: concurrency/AtomicIntegerTest.java
package com.dozy.learn.concurrency;

import java.util.concurrent.*;
import java.util.concurrent.atomic.*;

public class AtomicIntegerTest implements Runnable {
    private AtomicInteger i = new AtomicInteger(0);
    private boolean cancel = false;

    public boolean isCancel() {
        return cancel;
    }

    public void setCancel(boolean b) {
        cancel = b;
    }

    public int getValue() {
        return i.get();
    }

    private void evenIncrement() {
        i.addAndGet(2);
    }

    public void run() {
        while (true) {
            if (isCancel()) {
                break;
            }
            evenIncrement();
        }
    }

    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        AtomicIntegerTest ait = new AtomicIntegerTest();
        exec.execute(ait);
        while (true) {
            int val = ait.getValue();
            System.out.println(val);
            if (val > 100) {
                ait.setCancel(true);
                break;
            }
        }
        exec.shutdown();
    }
} // /:~
