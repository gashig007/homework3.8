package com.example.homework38;

import java.io.Serializable;

public class FirstModel implements Serializable {
    private Integer image;
    private String text;
    private String name;

    public FirstModel(Integer image, String text, String name) {
        this.image = image;
        this.text = text;
        this.name = name;
    }

    public Integer getImage() {
        return image;
    }

    public void setImage(Integer image) {
        this.image = image;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
