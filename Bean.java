package com.shevlik.topic7;

//Задача В4 стр126

public class Bean extends FruitGroup {
    private final boolean IS_HAVE_POD=true;//ввиде стручка

    public Bean(String name, int caloriesCount, String colour, LifeTime lifeTime) {
        setName(name);
        setCaloriesCount(caloriesCount);
        setColour(colour);
        setLifeTime(lifeTime);
    }

    @Override
    public String toString() {
        return getName()+": "+super.toString()+" относится к бобовым, " +
                " цвет "+getColour()+
                ", "+getCaloriesCount()+" кал/100гр, ";
    }
}
