package com.lmmlog.factory.entity.food;

import com.lmmlog.factory.entity.AbstractProject;

public abstract class AbstractFood extends AbstractProject {
    /**
     * 标签
     */
    protected String lab = "粮食";

    @Override
    public String getName() {
        return lab + ":" + this.name;
    }
}
