package edu.cnm.deepdive.prework;

/**
 * Converting Gallons to Liters
 * @author caryl Stuart
 */
public class GalToLit {
  public static void main(String args[]) {
    double gallons; //holds the number of gallons
    double liters;  //holds conversion to liters
    int counter;

    counter = 0;
    for (gallons = 1; gallons <= 100; gallons++) {
      liters = gallons * 3.7854;  //3.7854 litters in a gallon; convert to litters

      System.out.println(gallons + " gallons is " + liters + " liters.");
      counter++;
      //every 10th line, print a blank line
      if (counter == 10) {
        System.out.println();
        counter = 0; //reset the line counter.
      }
    }

  }

}
