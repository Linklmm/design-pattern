package com.lmmlog.factory.factoryMethod;

import com.lmmlog.factory.entity.Project;

public abstract class AbstractFactory {
    public abstract Project getProject(double money);
}
