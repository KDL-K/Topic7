package com.shevlik.topic7;

//Задача В4 стр126

public class Pumpkin extends FruitGroup { //тыквенные
    private final boolean IS_BIG=true;//большой плод
    private final boolean IS_CRUST_STRONG=true;//твердая корка

    public Pumpkin(String name, int caloriesCount, String colour, LifeTime lifeTime) {
        setName(name);
        setCaloriesCount(caloriesCount);
        setColour(colour);
        setLifeTime(lifeTime);
    }
    public boolean isIS_BIG() {
        return IS_BIG;
    }
    public boolean isIS_CRUST_STRONG() {
        return IS_CRUST_STRONG;
    }

    @Override
    public String toString() {
        return getName()+": "+super.toString()+" относится к тыквенным, " +
                " цвет "+getColour()+
                ", "+getCaloriesCount()+" кал/100гр, ";
    }
}
