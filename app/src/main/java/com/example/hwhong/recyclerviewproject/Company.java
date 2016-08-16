package com.example.hwhong.recyclerviewproject;

/**
 * Created by hwhong on 8/12/16.
 */
public class Company {

    private String name;
    private String description;
    private int image;

    public Company(String name, String description, int image) {
        this.name = name;
        this.description = description;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
