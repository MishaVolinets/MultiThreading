package com.MishaVolinets._11_multithreading02;

/**
 * Created by misha on 04.08.16.
 */
public class Producer implements Runnable {

    public Thread t;
    Q q;

    Producer(Q q){
        this.q = q;
        t = new Thread(this,"Producer");
        t.start();
    }

    @Override
    public void run() {
        int i = 0;
        while (true)q.put(i++);

    }
}
