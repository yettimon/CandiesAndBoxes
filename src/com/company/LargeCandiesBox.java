package com.company;

/*
 *
 * Classame : LargeCandiesBox
 * @param LargeCandiesBox - creating Large Box with candies with name,weight and amount
 *
 * */
public class LargeCandiesBox implements ICandiesWeight {


    private String candieName;
    private int candieWeight;
    private int candieAmount;

    // Generate empty constructor
    public LargeCandiesBox() {
    }

    // Generate constructor for Large Candie Box

    public LargeCandiesBox(String candieName, int candieWeight, int candieAmount) {
        this.candieName = candieName;
        this.candieWeight = candieWeight;
        this.candieAmount = candieAmount;
    }

    //getters + setters

    public String getCandieName() {
        return candieName;
    }

    public void setCandieName(String candieName) {
        this.candieName = candieName;
    }

    public int getCandieWeight() {
        return candieWeight;
    }

    public void setCandieWeight(int candieWeight) {
        this.candieWeight = candieWeight;
    }

    public int getCandieAmount() {
        return candieAmount;
    }

    public void setCandieAmount(int candieAmount) {
        this.candieAmount = candieAmount;
    }

    // adding toString method
    @Override
    public String toString() {
        return "LargeCandiesBox{" +
                "candieName='" + candieName + '\'' +
                ", candieWeight=" + candieWeight +
                ", candieAmount=" + candieAmount +
                '}';
    }

    // implementing method to calculate weight of candies in Large box
    @Override
    public int getTotalWeight() {
        return(int) (this.getCandieWeight() * this.getCandieAmount());
    }
}

