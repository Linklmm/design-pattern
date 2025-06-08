package com.lmmlog.factory.factoryMethod;

import com.lmmlog.factory.entity.Project;
import com.lmmlog.factory.entity.fj.FJApple;
import com.lmmlog.factory.entity.fj.FJBanana;
import com.lmmlog.factory.entity.fj.FJOrange;
import com.lmmlog.factory.entity.fj.FJPineapple;
import com.lmmlog.factory.entity.fj.FJRicePlant;
import com.lmmlog.factory.entity.fj.FJWatermelon;

public class FJProjectMethodFactory extends AbstractFactory {
    @Override
    public Project getProject(double money) {
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
        } else if (10 == money) {
            return new FJRicePlant();
        }
        return null;
    }
}
