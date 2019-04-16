public class Main {
  public static void main(String[] args) {
    //pluralize test 
    // int testOne = 1;
    // String testTwo = "dog";
    System.out.println(pluralize("dog", 3));
  }
  //write a function called pluralize that accepts a word and a number and returns a string with the word pluralized with an 's' if the number is 0 or >1.

  public static String pluralize(String word, int num) {
    if (num == 0 || num >1) {
      return word + "s ";  
    }
    return word;
  }
  //write a function called flipNHeads that accepts an int n and flips coins until n heads are flipped in a row. Simulate flipping by choosing a random num between 0-1. <.5 is tails, >.5 is heads. Print 'heads' or 'tails' on one line for each flip. Print 'It took Flips flips to flip N heads in a row' once n heads in a row are reached.

  // write a method clock that uses LocalDateTime object to constantly print current time to console each second. Should run until manually killed. should detect when seconds increase and only print when timestamp changes.
}