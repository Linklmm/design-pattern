package com.lmmlog.factory;

import com.lmmlog.factory.entity.Apple;
import com.lmmlog.factory.entity.Orange;
import com.lmmlog.factory.entity.Watermelon;

/**
 * 超市
 */
public class Store {

    void pay(double money) {
        if (money == 1.5) {
            Orange orange = new Orange();
            orange.show();
        }
        if (money == 2.5) {
            Apple apple = new Apple();
            apple.show();
        }
        if (money == 3.5) {
            Watermelon watermelon = new Watermelon();
            watermelon.show();
        }
    }

    public static void main(String[] args) {
        Store store = new Store();
        store.pay(1.5);
        //store.pay(2.5);
        //store.pay(3.5);
    }
}
