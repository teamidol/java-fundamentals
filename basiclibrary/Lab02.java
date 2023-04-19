
import java.util.Random;

public class Lab02 {

  public static void main(String[] args) {
    
    System.out.println(roll());
    System.out.println(containsDuplicates());
    System.out.println()
  }

  // rolling dice
  public static String roll(int n) {

    Random dice = new Random();
    n = dice.nextInt(6);
    System.out.println(n);
    }

   // contains duplicates

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

    // calculating averages

    public static double arrayAvg() {

      // Random dice = new Random();
      // n = dice.nextInt(6);
      // System.out.println(n);
      // }

      // array of arrays

      public static String lowAvgOfArrays(int n) {

        // Random dice = new Random();
        // n = dice.nextInt(6);
        // System.out.println(n);
        }

     }
}
