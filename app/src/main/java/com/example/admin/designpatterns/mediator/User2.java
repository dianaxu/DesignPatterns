package com.example.admin.designpatterns.mediator;

/**
 * @author Diana
 * @date 2017/6/25
 */

public class User2 extends User {

    public User2(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void work() {
        System.out.println("user2 exe!");
    }
}
