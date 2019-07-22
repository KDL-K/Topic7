package com.shevlik.topic7;

//Задача В4 стр126

public class Vegetables {
    private String name;
    private int caloriesCount;
    private String colour;
    private LifeTime lifeTime;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCaloriesCount() {
        return caloriesCount;
    }

    public void setCaloriesCount(int caloriesCount) {
        this.caloriesCount = caloriesCount;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public LifeTime getLifeTime() {
        return lifeTime;
    }

    public void setLifeTime(LifeTime lifeTime) {
        this.lifeTime = lifeTime;
    }

    @Override
    public String toString() {
        return " Овощи ";
    }
}
