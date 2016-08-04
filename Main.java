package com.MishaVolinets._11_multithreading02;

/**
 * Created by misha on 04.08.16.
 */
public class Main {
    public static void main(String[] args) {
        Q q = new Q();
        Producer producer = new Producer(q);
        Client client = new Client(q);

    }
}
