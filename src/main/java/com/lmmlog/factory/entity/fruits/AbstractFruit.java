package com.lmmlog.factory.entity.fruits;

import com.lmmlog.factory.entity.AbstractProject;

/**
 * 水果抽象类
 */
public abstract class AbstractFruit extends AbstractProject {
    protected String lab = "水果";

    @Override
    public String getName() {
        return lab + ":" + this.name;
    }
}
