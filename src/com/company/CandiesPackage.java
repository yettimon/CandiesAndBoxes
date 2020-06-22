package com.company;


/*
 *
 * /*
 * Classame : CandiesPackage
 * @param CandiesPackage - creating Large Box with candies with only candie name, and packageWeight
 *
 * */
public class CandiesPackage implements ICandiesWeight{

    private String packageCandieName;
    private int packageWeight; // candie weight in package

    // Generate empty constructor.
    public CandiesPackage() {
    }

    // Generate constructor for candie package

    public CandiesPackage(String packageCandieName, int packageWeight) {
        this.packageCandieName = packageCandieName;
        this.packageWeight = packageWeight;
    }


    //getters + setters

    public String getPackageCandieName() {
        return packageCandieName;
    }

    public void setPackageCandieName(String packageCandieName) {
        this.packageCandieName = packageCandieName;
    }

    public int getPackageWeight() {
        return packageWeight;
    }

    public void setPackageWeight(int packageWeight) {
        this.packageWeight = packageWeight;
    }

    @Override
    public String toString() {
        return "CandiesPackage{" +
                "packageCandieName='" + packageCandieName + '\'' +
                ", packageWeight=" + packageWeight +
                '}';
    }

    // implementing method to calculate weight of candies in Large box

    @Override
    public int getTotalWeight() {
        return getPackageWeight() + 50;
    }
}
