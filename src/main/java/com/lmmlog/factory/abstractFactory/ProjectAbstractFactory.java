package com.lmmlog.factory.abstractFactory;

import com.lmmlog.factory.entity.food.AbstractFood;
import com.lmmlog.factory.entity.fruits.AbstractFruit;

/**
 * 商品工厂接口
 */
public interface ProjectAbstractFactory {
    /**
     * 创建水果工厂
     * @return
     */
    AbstractFruit createFruit(double money);

    /**
     * 创建粮食工厂
     * @return
     */
    AbstractFood createFood(double money);
}
