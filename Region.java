package com.shevlik.topic7;

//Задача А4 стр124

import java.util.Arrays;

public class Region extends AreaUnit {
    Region(String name, int area, int populationCount, AreaUnit... units) {
        setName(name);
        setArea(area);
        setPopulationCount(populationCount);
        setUnits(units);
    }

    @Override
    public String toString() {
        return getName()+" р-н, " + "города: "+ Arrays.toString(getUnits())+';';
    }
}
