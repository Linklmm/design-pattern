package com.lmmlog.factory.factoryMethod;

public class TestClient {
    public static void main(String[] args) {
        BJStore bjStore = new BJStore(new BJProjectMethodFactory());
        bjStore.pay(5);

        FJStore fjStore = new FJStore(new FJProjectMethodFactory());
        fjStore.pay(10);
    }
}
