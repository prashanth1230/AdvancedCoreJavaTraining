package com.threads;

import java.util.Date;
import java.util.LinkedList;
import java.util.Queue;

public class EventManager {

    private int size;

    private Queue<Date> events;

    public EventManager() {
        size = 10;
        events = new LinkedList<>();
    }

    // Called By Producer Thread
    public synchronized void write() {
        while (events.size() == size) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        events.add(new Date());
        System.out.printf("Write :%d\n", events.size());
        notifyAll();
    }

    // Called By Consumer Thread
    public void read() {
        synchronized (this) {
            while (events.size() == 0) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.printf("Read :%d,%s\n",
                    events.size(), events.poll());
            notify();
        }
    }

}
