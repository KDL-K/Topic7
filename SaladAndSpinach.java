package com.shevlik.topic7;

//Задача В4 стр126

public class SaladAndSpinach extends VegetativeGroup {//салатно-шпинатные
    private final boolean IS_SALAD_OR_SPINACH=true;

    public SaladAndSpinach(String name, int caloriesCount, String colour, LifeTime lifeTime) {
        setName(name);
        setCaloriesCount(caloriesCount);
        setColour(colour);
        setLifeTime(lifeTime);
    }

    @Override
    public String toString() {
        return getName()+": "+super.toString()+" относится к салатно-шпинатным, " +
                " цвет "+getColour()+
                ", "+getCaloriesCount()+" кал/100гр, ";
    }
}
