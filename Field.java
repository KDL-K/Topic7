package com.shevlik.topic7;

//Задача А4 стр124

import java.util.Arrays;

public class Field extends AreaUnit {
    Field(String name, int area, int populationCount, AreaUnit... units) {
        setName(name);
        setArea(area);
        setPopulationCount(populationCount);
        setUnits(units);
    }
    public void showCenter(){
        int size=getUnits().length;
        for(int i=0;i<size;i++) {
            int size2=getUnits()[i].getUnits().length;
            for(int j=0;j<size2;j++) {
                if (getUnits()[i].getUnits()[i].isCenter()) {
                    System.out.println("The Center of " + getName() + " is " + getUnits()[i].getUnits()[i].getName());
                    break;
                }
            }
        }
    }

    @Override
    public String toString() {
        return getName()+" область, " + "районы: "+ Arrays.toString(getUnits());
    }
}
