package com.shevlik.topic7;

//Задача В4 стр126

public class Onion extends VegetativeGroup {
    private final boolean IS_ONION=true;

    public Onion(String name, int caloriesCount, String colour, LifeTime lifeTime) {
        setName(name);
        setCaloriesCount(caloriesCount);
        setColour(colour);
        setLifeTime(lifeTime);
    }

    @Override
    public String toString() {
        return getName()+": "+super.toString()+" относится к луковым, " +
                " цвет "+getColour()+
                ", "+getCaloriesCount()+" кал/100гр, ";
    }
}
