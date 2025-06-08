package com.lmmlog.factory.factoryMethod;


import com.lmmlog.factory.entity.Project;
import com.lmmlog.factory.entity.bj.BJApple;
import com.lmmlog.factory.entity.bj.BJBanana;
import com.lmmlog.factory.entity.bj.BJOrange;
import com.lmmlog.factory.entity.bj.BJPineapple;
import com.lmmlog.factory.entity.bj.BJRice;
import com.lmmlog.factory.entity.bj.BJWatermelon;

public class BJProjectMethodFactory extends AbstractFactory {
    @Override
    public Project getProject(double money) {
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
        } else if (5.5 == money) {
            return new BJRice();
        }
        return null;
    }
}
