package com.shevlik.topic7;

//Задача А4 стр124


import java.util.Arrays;
import java.util.Objects;

public class AreaUnit {
    private String name;
    private int populationCount;
    private int area;
    private AreaUnit[] units;
    private boolean isCenter;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulationCount() {
        return populationCount;
    }

    public void setPopulationCount(int populationCount) {
        this.populationCount = populationCount;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public AreaUnit[] getUnits() {
        return units;
    }

    public void setUnits(AreaUnit[] units) {
        int size=units.length;
        this.units=new AreaUnit[size];
        for(int i=0;i<size;i++) {
            this.units[i] = units[i];
        }
    }

    public boolean isCenter() {
        return isCenter;
    }

    public void setCenter(boolean center) {
        isCenter = center;
    }

    public void showCenter(){
        int size=units.length;
        for(int i=0;i<size;i++) {
            if(units[i].isCenter()){
              System.out.println("Center is "+units[i].getName());
              break;
            }
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AreaUnit areaUnit = (AreaUnit) o;
        return getPopulationCount() == areaUnit.getPopulationCount() &&
                getArea() == areaUnit.getArea() &&
                isCenter() == areaUnit.isCenter() &&
                getName().equals(areaUnit.getName()) &&
                Arrays.equals(getUnits(), areaUnit.getUnits());
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(getName(), getPopulationCount(), getArea(), isCenter());
        result = 31 * result + Arrays.hashCode(getUnits());
        return result;
    }
}
