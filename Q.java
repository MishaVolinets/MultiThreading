package com.MishaVolinets._11_multithreading02;

/**
 * Created by misha on 04.08.16.
 */
public class Q {
    int n;
    public boolean valueSet  = false;

    public synchronized int get(){
        while (!valueSet){
            try {
                wait();
            }catch (InterruptedException ex){
                ex.printStackTrace();
            }
        }

        System.out.println("Get n: " + n);
        valueSet = false;
        notify();
        return n;
    }

    public synchronized void put(int n){
        while(valueSet){
            try {
                wait();
            }catch (InterruptedException ex){
                ex.printStackTrace();
            }
        }
        this.n = n;
        System.out.println("N is sended : " + n);
        valueSet = true;
        notify();
    }

}
