package com.shevlik.topic7;

//Задача В4 стр126

public class Tomato extends FruitGroup {
    private boolean isVeryJuicy;//очень сочный

    public Tomato(String name, int caloriesCount, String colour, LifeTime lifeTime, boolean isVeryJuicy) {
        setName(name);
        setCaloriesCount(caloriesCount);
        setColour(colour);
        setLifeTime(lifeTime);
        this.isVeryJuicy = isVeryJuicy;
    }

    public boolean isVeryJuicy() {
        return isVeryJuicy;
    }

    public void setVeryJuicy(boolean veryJuicy) {
        isVeryJuicy = veryJuicy;
    }

    @Override
    public String toString() {
        return getName()+": "+super.toString()+" относится к томатным, " +
                " цвет "+getColour()+
                ", "+getCaloriesCount()+" кал/100гр, "+
                ((isVeryJuicy)?" плоды очень сочные":" плоды сочные");
    }
}
