package com.qf.proxy.jkd;




public class Client {
    public static void main(String[] args) {
       Star star= (Star) new ProxyFactory(new RealStar()).getRealObj();
        star.sing();
        System.out.println(star.getClass());

    }
}
