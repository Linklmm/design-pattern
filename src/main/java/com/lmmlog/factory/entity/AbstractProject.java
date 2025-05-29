package com.lmmlog.factory.entity;

import lombok.Getter;
import lombok.Setter;

/**
 * 商品抽象类
 */
@Getter
@Setter
public abstract class AbstractProject implements Project {
    /**
     * 价格
     */
    protected double price;
    /**
     * 名称
     */
    protected String name;
    @Override
    public void show() {
        System.out.println("好吃的"+ this.name + this.price);
    }
}
