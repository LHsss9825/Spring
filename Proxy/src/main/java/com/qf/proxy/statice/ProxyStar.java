package com.qf.proxy.statice;
//代理角色：宋吉吉
public class ProxyStar implements Star {

    private Star star;

    //问题2：只能代理Star类型的对象
    public ProxyStar(Star star) {
        this.star = star;
    }

    public void bookTicket() {
        System.out.println("ProxyStar.bookTicket()");
    }

    public void collectMoney() {
        System.out.println("ProxyStar.collectMoney()");
    }

    public void confer() {
        System.out.println("ProxyStar.confer()");
    }

    public void signContract() {
        System.out.println("ProxyStar.signContract()");
    }

    public void sing() {
        star.sing();
    }
}
