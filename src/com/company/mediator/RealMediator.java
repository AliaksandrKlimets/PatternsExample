package com.company.mediator;

public class RealMediator implements Mediator {

    private Button button1;

    private Button button2;

    public RealMediator() {
        this.button1 = new Button(this);
        this.button2= new Button(this);
    }

    @Override
    public void notifyComponent(Component component, String action) {
        if (component == button1 && action.equals("click")) {
            System.out.println("Button 1 clicked");
        } else if (component == button2 && action.equals("click")) {
            System.out.println("Button 2 clicked");
        }
    }

    public Button getButton1() {
        return button1;
    }

    public Button getButton2() {
        return button2;
    }
}
