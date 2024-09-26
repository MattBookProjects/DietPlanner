package com.ofbooks.dietplanner;

public class CycleDuration {
    private int unitCount;
    private TimeUnitConst timeUnit;

    public CycleDuration(int unitCount, TimeUnitConst timeUnit){
        this.unitCount = unitCount;
        this.timeUnit = timeUnit;
    }

    public int getUnitCount(){
        return this.unitCount;
    }

    public TimeUnitConst timeUnit(){
        return this.timeUnit;
    }
}