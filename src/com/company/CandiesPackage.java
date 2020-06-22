/*
 *
 * Classame : CandiesPackage
 *
 *  26 June 2020
 *
 * Author: Stavnichuk Dmytro
 * Version: 1.0
 *
 *  Module 3, Laboratory Work
 *
 * Variant number II
 * Candies in boxes and by weight.

 *
 * */
package com.company;


/*
 *
 * @param CandiesPackage - creating Large Box with candies with name,weight and amount
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
