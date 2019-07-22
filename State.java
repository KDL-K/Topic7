package com.shevlik.topic7;

//Задача А4 стр124

import java.util.Arrays;

public class State extends AreaUnit {


    State(String name, int area, int populationCount, AreaUnit... units) {
        setName(name);
        setArea(area);
        setPopulationCount(populationCount);
        setUnits(units);
    }

    public void showCenter(){
        int size=getUnits().length;
        for(int i=0;i<size;i++) {
            if(getUnits()[i].isCenter()){
                System.out.println("The Capital of "+getName()+" is "+getUnits()[i].getName());
                break;
            }
        }
    }

    @Override
    public String toString() {
        return getName()+", " + "включает: "+ Arrays.toString(getUnits());
    }

}
