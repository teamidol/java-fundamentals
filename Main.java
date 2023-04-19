import java.time.LocalDateTime;
import java.util.Random;

public class Main {

  public static void main(String[] args) {
    int num2 = 1;
    System.out.println("I own " + num2 + " " + pluralize("dog", num2) + ".");

    int n = 3;
    String coinFlipResult = flipNHeads(n);
    System.out.println("It took me " + coinFlipResult + " flips to flip " + n + " Heads in a row.");

    String timeNow = clock();
    System.out.println(timeNow);

  }

  public static String pluralize(String word2, int num2) {

    if (num2 == 1) {
      return word2;
    } else {
      return word2 + "s";
    }
  }

  // (Andrew's Code for pluralize)
// public static String pluralize(String word, int number) {
//   if (number == 0 || number > 1) {
//       return word + "s";
//   } else {
//       return word;
//   }
// }
// 5:45
// and then I am calling the function here under public static void main 
// String word = "cat";
//   int number = 10;
//   String pluralizedWord = pluralize(word, number);
//   System.out.println("I own "  + number + " " + pluralizedWord);

  // (fm lecture screenshots, study)
  public static String flipNHeads(int n) {
    Random random = new Random();
    int numHeads = 0;
    int numFlips = 0;
    double inBetween = 0.5;
    String result = "";

    while (numHeads != n) {
      double coinFlip = random.nextDouble();
      numFlips = coinFlip < inBetween ? numFlips + 1 : numFlips + 1;
      System.out.println(coinFlip < inBetween ? "Tails" : "Heads");

      numHeads = coinFlip > inBetween ? numHeads + 1 : 0;
      result = Integer.toString(numFlips);

    }
    return result;
  }
  // public static String flipNHeads() {

  //   int counter = 0;
  //   Random rand = new Random();
  //   Double DR1 = rand.nextDouble();

  //    while( DR1 <= .5 ) {
  //        if( DR1 <= .5) {
  //         return "tails";
  //     }else 
  //     // if (DR1 > .5)
  //     {
  //       counter++;     
  //       System.out.println("It took " + counter + " times to flip to heads.");
  //     // }else{
  //     }
  //   }
  //   return null;
  // }
    public static String clock() {
      int seconds = 0;
      while (true) {
        LocalDateTime now = LocalDateTime.now();
        int hour = now.getHour();
        int minute = now.getMinute();
        int second = now.getSecond();
        if (second != seconds) {
          seconds = second;
          System.out.println(hour + ":" + minute + ":" + second);
        }
      }
    }
  }


  // LocalDateTime now = LocalDateTime.now();
  // int hour = now.getHour();
  // int minute = now.getMinute();
  // int seconds = now.getSecond();

  // while (true) {
  //   now = LocalDateTime.now();
  //   int seconds2 = now.getSecond();

  //   if (seconds2 != seconds) {
  //     System.out.println(hour+":"+minute+":"+seconds);
  //     seconds = seconds2;
  //   }
  // }
