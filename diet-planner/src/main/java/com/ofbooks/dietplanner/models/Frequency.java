package com.ofbooks.dietplanner;

public class Frequency {
    private int numberOfInstances;
    private int numberOfUnitsOfTime;
    private TimeUnitConst timeUnit;

    public Frequency(int numberOfInstances, int numberOfUnitsOfTime, TimeUnitConst timeUnit){
        this.numberOfInstances = numberOfInstances;
        this.numberOfUnitsOfTime = numberOfUnitsOfTime;
        this.timeUnit = timeUnit;
    }
}