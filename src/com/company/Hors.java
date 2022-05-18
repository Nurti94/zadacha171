package com.company;

public class Hors extends Animal{
    private String color;

    public Hors(int weight, int age, String gender, String nickName,String color) {
        super(weight, age, gender, nickName);
        this.color=color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return
                "color=" + color  +
                ", " + super.toString();
    }
}
