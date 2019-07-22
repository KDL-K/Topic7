package com.shevlik.topic7;

//Задача B5 стр90

import java.util.Arrays;

public class Interval {
    private int pointA;
    private int pointB;
    private int intervalAB;
    private int[] arrayInterval;
    private boolean isIncludeAB;

    public Interval(Interval interval,int intervalABNew){
        pointA=interval.getArrayInterval()[0];
        pointB=interval.pointA+intervalABNew;
        setIntervalAB();
        isIncludeAB=true;
        setArrayInterval();
    }

    public Interval(boolean includeAB){
        setPointA();
        setPointB();
        setIntervalAB();
        this.isIncludeAB=includeAB;
        setArrayInterval();

    }
    public Interval(int pointA, int pointB, boolean includeAB){
        this.pointA=pointA;
        this.pointB=pointB;
        setIntervalAB();
        this.isIncludeAB=includeAB;
        setArrayInterval();
    }

    public int getPointA() {
        return pointA;
    }

    public void setPointA() {
        pointA = (int)(Math.random()*20);
    }

    public int getPointB() {
        return pointB;
    }

    public void setPointB() {
        pointB = pointA+(int)(Math.random()*10)+2;
    }

    public int getIntervalAB() {
        return intervalAB;
    }

    public void setIntervalAB() {
        intervalAB = pointB-pointA;
    }

    public int[] getArrayInterval() {
        return arrayInterval;
    }

    public void setArrayInterval() {
        int i=0;
        for(int j=pointA;j<=pointB;j++,i++){}
        if(isIncludeAB) {
            arrayInterval=new int[i];
            for(int j=0;j<arrayInterval.length;j++){
                arrayInterval[j]=j+pointA;
            }
        }
        else {
            arrayInterval=new int[i-2];
            for(int j=0;j<arrayInterval.length;j++) {
                arrayInterval[j] = j + pointA + 1;
            }
        }
    }

    public boolean isIncludeAB() {
        return isIncludeAB;
    }

    public void setIncludeAB(boolean includeAB) {
        isIncludeAB = includeAB;
    }

    public static void showCross(Interval... intervals){
        int size=intervals.length;
        for (int i=0;i<size-1;i++){
            for (int j=i+1;j<size;j++){
                for(int k=0;k<intervals[i].getArrayInterval().length;k++){
                    if(intervals[i].getArrayInterval()[k]>=intervals[j].getArrayInterval()[0]&&intervals[i].getArrayInterval()[k]<=intervals[j].getArrayInterval()[intervals[j].getArrayInterval().length-1]){
                        System.out.println("The interval "+(i+1)+" crosses the interval "+(j+1));
                        break;
                    }
                }
            }
        }
    }
    public static int distanceMax(Interval... intervals){
        int min=intervals[0].getArrayInterval()[0];
        int max=intervals[0].getArrayInterval()[0];
        int size=intervals.length;
        for (int i=0;i<size;i++){
            if(intervals[i].getArrayInterval()[0]<min){
                min=intervals[i].getArrayInterval()[0];
            }
            if(intervals[i].getArrayInterval()[intervals[i].getArrayInterval().length-1]>max) {
                max=intervals[i].getArrayInterval()[intervals[i].getArrayInterval().length-1];
            }
        }
        return max-min;
    }
    public static Interval intervalMinus(Interval interval1, Interval interval2){
        int intervalABNew;
        if(interval1.getIntervalAB()>interval2.getIntervalAB()){
            intervalABNew=interval1.getIntervalAB()-interval2.getIntervalAB()+1;
            return new Interval(interval1,intervalABNew);
        }
        else {
            intervalABNew=interval2.getIntervalAB()-interval1.getIntervalAB()+1;
            return new Interval(interval2,intervalABNew);
        }
    }
    public static Interval intervalPlus(Interval interval1, Interval interval2){
        int intervalABNew;
        intervalABNew=interval1.getIntervalAB()+interval2.getIntervalAB()+1;
        if(interval1.getArrayInterval()[0]<interval2.getArrayInterval()[0]){
            return new Interval(interval1,intervalABNew);
        }
        else {
            return new Interval(interval2,intervalABNew);
        }
    }

    @Override
    public String toString() {
        return "Interval{" +
                "pointA=" + pointA +
                ", pointB=" + pointB +
                ", intervalAB=" + intervalAB +
                ", arrayInterval=" + Arrays.toString(arrayInterval) +
                ", isIncludeAB=" + isIncludeAB +
                '}';
    }
}
