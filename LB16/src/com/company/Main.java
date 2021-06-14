package com.company;

interface Charging1{
    public void V();
}

interface Charging2{
    public void V();
}

class Phone1 implements Charging1 {
    final public int volt = 220;

    @Override
    public void V() {
        System.out.println("220 Volt");
    }
}

class Phone2 implements Charging2{
    final public int volt = 380;

    @Override
    public void V(){
        System.out.println("380 volt");
    }
}

class Adapter implements Charging1{
    Charging2 Charging2;

    public Adapter(Charging2 Charging2){
        this.Charging2 = Charging2;
    }

    @Override
    public void V(){
        Charging2.V();
    }
}

class Port{
    private Charging1 Pt;
    public Port(Charging1 Pt){
        this.Pt = Pt;
    }

    public void work(){
        Pt.V();
    }
}

public class Main {
    public static void main(String[] args) {
        Charging1 phone1 = new Phone1();
        Port Pn = new Port(phone1);
        Pn.work();

        Adapter phone2 = new Adapter(new Phone2());
        Port Pn2 = new Port(phone2);
        Pn2.work();
    }
}