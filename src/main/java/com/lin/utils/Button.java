package com.lin.utils;

public class Button {

    private String type;

    private String name;

    private  Button[] Buttons;


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Button[] getButtons() {
        return Buttons;
    }

    public void setButtons(Button[] buttons) {
        Buttons = buttons;
    }
}
