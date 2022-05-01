package com.company.mediator;

public abstract class Component {

    private Mediator mediator;

    public Component(Mediator mediator) {
        this.mediator = mediator;
    }

    public void click() {
        this.mediator.notifyComponent(this, "click");
    }

}
