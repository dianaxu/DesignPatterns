package com.example.admin.designpatterns.mediator;

/**
 * @author Diana
 * @date 2017/6/25
 */

public class User1 extends User {

    public User1(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void work() {
        System.out.println("user1 exe!");
    }
}
