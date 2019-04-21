public class Main {
  public static void main(String[] args) {
    //pluralize test 
    System.out.println(pluralize("dog", 3));
    System.out.println(pluralize("cat", 1));
    System.out.println(pluralize("turtle", 5));
    //flipNHeads test
    System.out.println(flipNHeads(3));
    System.out.println(flipNHeads(5));
    System.out.println(flipNHeads(7));
    //clock test
    clock();
  }

  //write a function called pluralize that accepts a word and a number and returns a string with the word pluralized with an 's' if the number is 0 or >1.
  public static String pluralize(String word, int num) {
    if (num == 0 || num >1) {
      return word + "s ";  
    }
    return word;
  }
  
  //write a function called flipNHeads that accepts an int n and flips coins until n heads are flipped in a row. Simulate flipping by choosing a random num between 0-1. <.5 is tails, >.5 is heads. Print 'heads' or 'tails' on one line for each flip. Print 'It took Flips flips to flip N heads in a row' once n heads in a row are reached.
  public static int flipNHeads(int num) {
    int i = 0;
    double random;
    random = Math.random();
    do { for (int j = 0; j < num; j++) {
      i++;
      random = (double)Math.random();
      if (random <= 0.5) {
        System.out.println("tails");
      } else {
        System.out.println("heads");
      }
    } 
    }
    while (i < num);
      return num;
  }

  // write a method clock that uses LocalDateTime object to constantly print current time to console each second. Should run until manually killed. should detect when seconds increase and only print when timestamp changes.
  public static String clock() {
    LocalDateTime now = new LocalDateTime.now();
    int hour = now.getHour();
    int minute = now.getMinute();
    int second = now.getSecond();
    String time = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
    System.out.println(time);
    return time;
  }
}
