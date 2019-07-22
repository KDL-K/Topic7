package com.shevlik.topic7;

public class Dessert extends VegetativeGroup {//дессертные
    private final boolean IS_DESSERT=true;

    public Dessert(String name, int caloriesCount, String colour, LifeTime lifeTime) {
        setName(name);
        setCaloriesCount(caloriesCount);
        setColour(colour);
        setLifeTime(lifeTime);
    }

    @Override
    public String toString() {
        return getName()+": "+super.toString()+" относится к десертным, " +
                " цвет "+getColour()+
                ", "+getCaloriesCount()+" кал/100гр, ";
    }
}
