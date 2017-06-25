package com.example.admin.designpatterns.mediator;

/**
 * @author Diana
 * @date 2017/6/25
 */

public abstract class User {
    private Mediator mediator;

    public Mediator getMediator() {
        return mediator;
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public User(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract void work();
}
