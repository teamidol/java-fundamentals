
import java.util.Random;

public class Lab02 {

  public static void main(String[] args) {
    
    System.out.println(roll());
    
    System.out.println(containsDuplicates());

    double[] numArray = { 45.3, 67.5, -45.6, 20.34, 33.0, 45.6 };
    double sum = 0.0;
    System.out.println(arrayAvg());

    System.out.println(lowAvgOfArrays());
  }

  // *********************** rolling dice
  // Write a method called roll that accepts an integer n and rolls a six-sided dice n times. The method should return an array containing the values of the rolls.


  public static String roll(int n) {

    Random dice = new Random();
    n = dice.nextInt(6);
    System.out.println(n);
    }

   // ************************ contains duplicates
   // Write a method called containsDuplicates that returns true or false depending on whether the array contains duplicate values.


   public static boolean containsDuplicates(int[] arr) {
    Set<Integer> set = new HashSet<>();
      for (int num : arr) {
        if (set.contains(num)) {
            return true;
        }
         set.add(num);
      }
        return false;
    }

    // ************************* calculating averages
    // Write a method that accepts an array of integers and calculates and returns the average of all the values in the array.

    public static double arrayAvg() {
   

        for (double num: numArray) {
           sum += num;
        }

        double average = sum / numArray.length;
        System.out.format("The average is: %.2f", average);
    }


      // ******************************** array of arrays
      // Given an array of arrays calculate the average value for each array and return the array with the lowest average.

      public static String lowAvgOfArrays(int n) {

        // Random dice = new Random();
        // n = dice.nextInt(6);
        // System.out.println(n);
        }
}

