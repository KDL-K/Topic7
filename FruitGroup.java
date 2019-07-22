package com.shevlik.topic7;

//Задача В4 стр126

public class FruitGroup extends Vegetables{
    final boolean IS_USED_FRUIT_OF_PLANT=true;

    public boolean isIS_USED_PART_OF_PLANT() {
        return IS_USED_FRUIT_OF_PLANT;
    }

    @Override
    public String toString() {
        return " группа плодовых, " +
                "используются плоды и семена, ";
    }
}
