package com.lmmlog.factory.factoryMethod;

public class TestClient {
    public static void main(String[] args) {
        BJStore bjStore = new BJStore(new BJProjectMethodFactory());
        System.out.println("北京商店");
        bjStore.pay(5.5);
        bjStore.pay(3);

        FJStore fjStore = new FJStore(new FJProjectMethodFactory());
        System.out.println("福建商店");
        fjStore.pay(10);
        fjStore.pay(1.5);
    }
}
