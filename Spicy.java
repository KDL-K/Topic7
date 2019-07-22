package com.shevlik.topic7;

//Задача В4 стр126

public class Spicy extends VegetativeGroup {//пряные
    private final boolean IS_SPICY=true;

    public Spicy(String name, int caloriesCount, String colour, LifeTime lifeTime) {
        setName(name);
        setCaloriesCount(caloriesCount);
        setColour(colour);
        setLifeTime(lifeTime);
    }

    @Override
    public String toString() {
        return getName()+": "+super.toString()+" относится к пряным, " +
                " цвет "+getColour()+
                ", "+getCaloriesCount()+" кал/100гр, ";
    }
}
