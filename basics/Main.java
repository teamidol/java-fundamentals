public class Main {

  public static void main(String[] args) {
    int num2 = 1;
    System.out.println("I own " + num2 + " " + pluralize("dog", num2) + ".");
  };

  public static String pluralize(String word2, int num2) {

    if (num2 == 1) {
      return word2;
    } else {
      return word2 + "s";
    }
  }
}


// (Andrew's Code)
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