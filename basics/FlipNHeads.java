import java.util.Random;

public class FlipNHeads {

  public static void main(String[] args) {
    System.out.println(flipNHeads());
  };

  public static String flipNHeads() {

    int counter = 0;
    Random rand = new Random();
    Double DR1 = rand.nextDouble();

     while( DR1 <= .5 ) {
         if( DR1 <= .5) {
          return "tails";
      }else 
      // if (DR1 > .5)
      {
        counter++;     
        System.out.println("It took " + counter + " times to flip to heads.");
      // }else{
      }
    }
    return null;
  }
}
    


















// public class FlipNHeads {

// public static void main(String[] args) {
// System.out.println("It took" + flips + "flips to flip heads in a row.");
// };

// public static void flipNHeads(int n) {
// Random rand = new Random();
// int flips = 0;
// int heads_in_a_row = 0;

// while (heads_in_a_row < n) {
// double flip = rand.nextDouble();
// if (flip < 0.5) {
// System.out.println("tails");
// heads_in_a_row = 0;
// } else {
// System.out.println("heads");
// heads_in_a_row += 1;
// flips += 1;
// }
// return flips;
// }
// }
// }