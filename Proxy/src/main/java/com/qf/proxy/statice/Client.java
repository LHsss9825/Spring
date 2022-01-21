package com.qf.proxy.statice;

public class Client {
    public static void main(String[] args) {
        Star proxy = new ProxyStar(new RealStar());
        System.out.println(proxy.getClass());
        proxy.bookTicket();
        proxy.collectMoney();
        proxy.confer();
        proxy.signContract();
        proxy.sing();

    }
}
