package com.lmmlog.factory.simpleFactory;

import com.lmmlog.factory.entity.Apple;
import com.lmmlog.factory.entity.Orange;
import com.lmmlog.factory.entity.Project;
import com.lmmlog.factory.entity.Watermelon;

public class SimpleProjectFactory {
    public static Project getProject(double money) {
        if (2.5 ==money) {
            return new Apple();
        } else if (1.5 ==money) {
            return new Orange();
        } else if (3.5 ==money) {
            return new Watermelon();
        }
        return null;
    }
}
