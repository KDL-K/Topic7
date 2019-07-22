package com.shevlik.topic7;

//Задача В4 стр126

import java.util.Arrays;

public class Salad {
    private String name;
    private Vegetables[] vegetables;
    private String otherIngredients;


    public Salad(String name, String otherIngredients, Vegetables... vegetables) {
        this.name = name;
        this.otherIngredients = otherIngredients;
        setVegetables(vegetables);
    }

    public void sortByCalories(){
        int size=vegetables.length;
        Vegetables[] buf=new Vegetables[size];
        for(int i=0;i<size-1;i++){
            for(int j=1+i;j<size;j++){
                if(vegetables[j].getCaloriesCount()<vegetables[i].getCaloriesCount()){
                    buf[j]=vegetables[i];
                    vegetables[i]=vegetables[j];
                    vegetables[j]=buf[j];
                }
            }
        }
    }


    public void searchByCalories(int calories){
        int size=vegetables.length;
        for(int i=0;i<size;i++){
            if(calories==vegetables[i].getCaloriesCount()){
                System.out.println(vegetables[i].toString());
            }
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vegetables[] getVegetables() {
        return vegetables;
    }

    public void setVegetables(Vegetables[] vegetables) {
        int size = vegetables.length;
        this.vegetables=new Vegetables[size];
        for (int i = 0; i < size; i++) {
            this.vegetables[i] = vegetables[i];
        }
    }

    public String getOtherIngredients() {
        return otherIngredients;
    }

    public void setOtherIngredients(String otherIngredients) {
        this.otherIngredients = otherIngredients;
    }

    @Override
    public String toString() {
        int size=vegetables.length;
        String[] buffer=new String[size];
        for(int i=0;i<size;i++){
            buffer[i]=vegetables[i].getName();
        }
        return "Салат " +
                "\'"+name+"\'" + ':' +
                Arrays.toString(buffer) +
                ", другие ингридиенты: " + otherIngredients+'\n';
    }
}
