package edu.cnm.deepdive.prework;

/**
 * Converting Gallons to Liters
 * @author caryl Stuart
 */
public class GalToLit {
  public static void main(String args[]) {
    double gallons; //holds the number of gallons
    double liters;  //holds conversion to liters

    gallons = 12; //Number of gallons to convert

    liters = gallons * 3.7854;  //3.7854 litters in a gallon; convert to litters

    System.out.println(gallons + " gallons is " + liters + " liters.");

  }

}
