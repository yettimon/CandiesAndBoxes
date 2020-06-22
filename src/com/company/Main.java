package com.company;

/*
 *
 * Classame : Main
 *
 *  26 June 2020
 *
 * Author: Stavnichuk Dmytro
 *
 *  Module 3, Laboratory Work
 *
 * Variant number II
 * Candies in boxes and by weight.

 *
 * */

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/*
 *
 * @param Main - program which calculates Candie Package and Candie Box with each other.
 * Including of calculation of :
 * average weight
 * min. weight
 * highest weight
 *
 * */
public class Main {

    public static void main(String[] args) {

        LargeCandiesBox Roshen = new LargeCandiesBox("Roshen",100,15);
        LargeCandiesBox Milka = new LargeCandiesBox("Milka",180,8);
        LargeCandiesBox Snickers = new LargeCandiesBox("Snickers",70,9);
        LargeCandiesBox Rafaello = new LargeCandiesBox("Rafaello",35,11);
        LargeCandiesBox KitKat = new LargeCandiesBox("KitKat",65,32);

        CandiesPackage Bounty = new CandiesPackage("Bounty",68);
        CandiesPackage Kinder = new CandiesPackage("Kinder",95);
        CandiesPackage Toffie = new CandiesPackage("Toffie",54);
        CandiesPackage Barnie = new CandiesPackage("Barnie",32);
        CandiesPackage Gummi = new CandiesPackage("Gummi",18);
        CandiesPackage Schluckwerder = new CandiesPackage("Schluckwerder",18);
        CandiesPackage ABK = new CandiesPackage("ABK",18);

        List<ICandiesWeight> candies = new ArrayList();

        // adding to list candies candies from LargeBox
        candies.add(Roshen);
        candies.add(Milka);
        candies.add(Snickers);
        candies.add(Rafaello);
        candies.add(KitKat);

        candies.add(Bounty);
        candies.add(Kinder);
        candies.add(Toffie);
        candies.add(Barnie);
        candies.add(Gummi);
        candies.add(Schluckwerder);
        candies.add(ABK);

        // calculating total weight of two boxes

        int candiesWeightSum = candies.stream()
                .mapToInt(ICandiesWeight::getTotalWeight).sum();
        System.out.println("Total weight of candies in Box and package "+ candiesWeightSum + "gramms");

        // calculating highest candies weight;

        ICandiesWeight highestWeight = candies.stream()
                .max(Comparator.comparingInt(ICandiesWeight::getTotalWeight)).orElse(null);


        ICandiesWeight lowestWeight = candies.stream()
                .min(Comparator.comparingInt(ICandiesWeight::getTotalWeight)).orElse(null);

        // calculating average candy weight

        double avgWeight = candies.stream().mapToInt(ICandiesWeight::getTotalWeight)
                .average().orElse(0);

        System.out.println("Highest candies weight : "+ highestWeight);
        System.out.println("Lowest candies weight : "+ lowestWeight);
        System.out.println("Average candies weight :"+ avgWeight);

        // comparing candies weight between Small and Large Boxes

        // finding candies weight in LargeCandeisBox
        int LargeCandiesBox = candies.stream()
                .filter(el -> el instanceof LargeCandiesBox)
                .mapToInt(ICandiesWeight::getTotalWeight).sum();


        // finding candies weight in SmallCandiesBox
        int CandiesPackage = candies.stream()
                .filter(el -> el instanceof CandiesPackage)
                .mapToInt(ICandiesWeight::getTotalWeight).sum();

        if(LargeCandiesBox > CandiesPackage){
            System.out.println("Large candeis box has more weight than Small one");
        }
        else {
            System.out.println("Small Candies Box has more weight than in package");
        }

    }
}
