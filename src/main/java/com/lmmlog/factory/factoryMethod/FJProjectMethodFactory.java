package com.lmmlog.factory.factoryMethod;

import com.lmmlog.factory.entity.*;

public class FJProjectMethodFactory extends AbstractFactory{
    @Override
    public Project getProject(double money) {
        if (2.5 ==money) {
            return new Apple();
        } else if (1.5 ==money) {
            return new Orange();
        } else if (3.5 ==money) {
            return new Watermelon();
        } else if (4.5 ==money) {
            return new Banana();
        } else if (5.5 ==money) {
            return new Pineapple();
        } else if (10 == money) {
            return new RicePlant();
        }
        return null;
    }
}
