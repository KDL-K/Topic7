package com.shevlik.topic7;

//Задача В4 стр126

public class Cabbage extends VegetativeGroup {
    private final boolean IS_CABBAGE=true;//употребляется капуста

    public Cabbage(String name, int caloriesCount, String colour, LifeTime lifeTime) {
        setName(name);
        setCaloriesCount(caloriesCount);
        setColour(colour);
        setLifeTime(lifeTime);
    }

    @Override
    public String toString() {
        return getName()+": "+super.toString()+" относится к капусте, " +
                " цвет "+getColour()+
                ", "+getCaloriesCount()+" кал/100гр, ";
    }
}
