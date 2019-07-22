package com.shevlik.topic7;

//Задача В4 стр126

public class RootCrop extends VegetativeGroup{//корнеплоды
    private final boolean IS_ROOT_CROP=true;//употребляется корнеплод

    public RootCrop(String name, int caloriesCount, String colour, LifeTime lifeTime) {
        setName(name);
        setCaloriesCount(caloriesCount);
        setColour(colour);
        setLifeTime(lifeTime);
    }

    @Override
    public String toString() {
        return getName()+": "+super.toString()+" относится к корнеплодным, " +
        " цвет "+getColour()+
                ", "+getCaloriesCount()+" кал/100гр, ";
    }
}
