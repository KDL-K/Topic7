package com.shevlik.topic7;

//Задача В4 стр126

public class TuberCrop extends VegetativeGroup {
    private final boolean IS_TUBER_CROP=true;//употребляется клубнеплода

    public TuberCrop(String name, int caloriesCount, String colour, LifeTime lifeTime) {
        setName(name);
        setCaloriesCount(caloriesCount);
        setColour(colour);
        setLifeTime(lifeTime);
    }

    @Override
    public String toString() {
        return getName()+": "+super.toString()+" относится к клубнеплодным, " +
                " цвет "+getColour()+
                ", "+getCaloriesCount()+" кал/100гр, ";
    }
}
