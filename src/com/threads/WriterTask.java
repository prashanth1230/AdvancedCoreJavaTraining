package com.threads;

import java.util.concurrent.TimeUnit;

public class WriterTask implements Runnable {

    private EventManager eventManager;

    public WriterTask(EventManager eventManager) {
        this.eventManager = eventManager;
    }

    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            eventManager.write();
            try {
                TimeUnit.SECONDS.sleep(30);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
