package com.lmmlog.factory.abstractFactory;
import com.lmmlog.factory.abstractFactory.fj.FJApple;
import com.lmmlog.factory.abstractFactory.fj.FJBanana;
import com.lmmlog.factory.abstractFactory.fj.FJOrange;
import com.lmmlog.factory.abstractFactory.fj.FJPineapple;
import com.lmmlog.factory.abstractFactory.fj.FJRicePlant;
import com.lmmlog.factory.abstractFactory.fj.FJWatermelon;
import com.lmmlog.factory.entity.food.AbstractFood;
import com.lmmlog.factory.entity.fruits.AbstractFruit;

public class FJProjectAbstractAbstractFactory implements ProjectAbstractFactory {
    @Override
    public AbstractFruit createFruit(double money) {
        if (2.5 == money) {
            return new FJApple();
        } else if (1.5 == money) {
            return new FJOrange();
        } else if (3.5 == money) {
            return new FJWatermelon();
        } else if (4.5 == money) {
            return new FJBanana();
        } else if (5.5 == money) {
            return new FJPineapple();
        }
        return null;
    }

    @Override
    public AbstractFood createFood(double money) {
        if (10 == money) {
            return new FJRicePlant();
        }
        return null;
    }
}
