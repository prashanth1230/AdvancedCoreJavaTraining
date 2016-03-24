package com.threads;

/**
 * Created by a487037 on 03/24/2016.
 */
public class TestWorkerThreads {
    public static void main(String[] args) {
        EventManager eventManager = new EventManager();
        ReadTask readTask = new ReadTask(eventManager);
        WriterTask writerTask = new WriterTask(eventManager);
        Thread readerThread = new Thread(readTask);
        readerThread.setName("Reader Thread");
        Thread writerThread = new Thread(writerTask);
        writerThread.setName("Writer Thread");

        //Starting the Writer Thread
        writerThread.start();

        //Asking the main thread to wait
        try {
            writerThread.join(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //Starting the reader thread
        readerThread.start();
    }
}
