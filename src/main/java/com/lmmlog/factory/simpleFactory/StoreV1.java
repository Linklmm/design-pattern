package com.lmmlog.factory.simpleFactory;

import com.lmmlog.factory.entity.Project;

public class StoreV1 {

    public void  pay(double money) {
        Project project = create(money);
        project.show();
    }
    public Project  create(double money){
        return SimpleProjectFactory.getProject(money);
    }

    public static void main(String[] args) {
        StoreV1  storeV1 = new StoreV1();
        storeV1.pay(4.5);
        storeV1.pay(2.5);
        storeV1.pay(3.5);

    }
}
