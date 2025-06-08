package com.lmmlog.factory.abstractFactory;
import com.lmmlog.factory.abstractFactory.bj.BJApple;
import com.lmmlog.factory.abstractFactory.bj.BJBanana;
import com.lmmlog.factory.abstractFactory.bj.BJOrange;
import com.lmmlog.factory.abstractFactory.bj.BJPineapple;
import com.lmmlog.factory.abstractFactory.bj.BJRice;
import com.lmmlog.factory.abstractFactory.bj.BJWatermelon;
import com.lmmlog.factory.entity.food.AbstractFood;
import com.lmmlog.factory.entity.fruits.AbstractFruit;

public class BJProjectAbstractAbstractFactory implements ProjectAbstractFactory {
    @Override
    public AbstractFruit createFruit(double money) {
        if (2.5 * 2 == money) {
            return new BJApple();
        } else if (1.5 * 2 == money) {
            return new BJOrange();
        } else if (3.5 * 2 == money) {
            return new BJWatermelon();
        } else if (4.5 * 2 == money) {
            return new BJBanana();
        } else if (5.5 * 2 == money) {
            return new BJPineapple();
        }
        return null;
    }

    @Override
    public AbstractFood createFood(double money) {
        if (5.5 == money) {
            return new BJRice();
        }
        return null;
    }
}
