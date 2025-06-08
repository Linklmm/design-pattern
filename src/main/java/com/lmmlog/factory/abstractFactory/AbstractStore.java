package com.lmmlog.factory.abstractFactory;

import com.lmmlog.factory.entity.food.AbstractFood;
import com.lmmlog.factory.entity.fruits.AbstractFruit;

import java.util.Objects;

public abstract class AbstractStore {
    protected ProjectAbstractFactory projectAbstractFactory;

    public AbstractStore(ProjectAbstractFactory projectAbstractFactory) {
       this.projectAbstractFactory = projectAbstractFactory;
    }

    public void pay(double money) {
        AbstractFruit fruit = projectAbstractFactory.createFruit(money);
        if (Objects.nonNull(fruit)) {
            fruit.show();
        }
        AbstractFood food = projectAbstractFactory.createFood(money);
        if (Objects.nonNull(food)) {
            food.show();
        }
    }
}
