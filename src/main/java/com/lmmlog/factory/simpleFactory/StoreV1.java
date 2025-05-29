package com.lmmlog.factory.simpleFactory;

import com.lmmlog.factory.entity.Project;

import java.util.Objects;

public class StoreV1 {
    public static void main(String[] args) {
        Project project = SimpleProjectFactory.getProject(4.5);
        if (Objects.isNull(project)) {
            System.out.println("没有此商品");
        }
        project.show();

        //project = ProjectFactory.getProject(2.5);
        //project.show();
        //
        //project = ProjectFactory.getProject(3.5);
        //project.show();
    }
}
