package com.MishaVolinets._11_multithreading02;

/**
 * Created by misha on 04.08.16.
 */
public class Client implements Runnable{
    public Thread t;
    public Q q;

    public Client(Q q){
        this.q = q;
        t = new Thread(this,"Clien");
        t.start();
    }
    @Override
    public void run() {
        while (true)q.get();
    }
}
