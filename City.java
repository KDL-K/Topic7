package com.shevlik.topic7;

//Задача А4 стр124

public class City extends AreaUnit {
    City(String name, int area, int populationCount, boolean isCenter, AreaUnit... units) {
        setName(name);
        setArea(area);
        setPopulationCount(populationCount);
        setCenter(isCenter);
        setUnits(units);
    }

    @Override
    public String toString() {
        return getName();
    }
}




