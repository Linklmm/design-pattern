package com.lmmlog.factory.factoryMethod;

import com.lmmlog.factory.entity.Project;

public abstract class AbstractStore {
    protected AbstractFactory factory;

    public AbstractStore(AbstractFactory factory) {
        this.factory = factory;
    }

    public void pay(double money) {
        Project project = factory.getProject(money);
        project.show();
    }
}
