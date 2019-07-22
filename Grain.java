package com.shevlik.topic7;

//Задача В4 стр126

public class Grain extends FruitGroup {
    private final boolean IS_CORN_ONLY=true;// представитель - только кукуруза

    public Grain(String name, int caloriesCount, String colour, LifeTime lifeTime) {
        setName(name);
        setCaloriesCount(caloriesCount);
        setColour(colour);
        setLifeTime(lifeTime);
    }

    @Override
    public String toString() {
        return getName()+": "+super.toString()+" относится к зерновым, " +
                " цвет "+getColour()+
                ", "+getCaloriesCount()+" кал/100гр, ";
    }
}
