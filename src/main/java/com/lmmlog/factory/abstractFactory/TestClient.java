package com.lmmlog.factory.abstractFactory;

public class TestClient {
    public static void main(String[] args) {
        BJAbstractFactoryStore bjStore = new BJAbstractFactoryStore(new BJProjectAbstractAbstractFactory());
        System.out.println("北京商店");
        bjStore.pay(5.5);
        bjStore.pay(3);

        FJAbstractFactoryStore fjStore = new FJAbstractFactoryStore(new FJProjectAbstractAbstractFactory());
        System.out.println("福建商店");
        fjStore.pay(10);
        fjStore.pay(1.5);
    }
}
