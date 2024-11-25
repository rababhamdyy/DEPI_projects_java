public class ChineseZodiac {

  public static void main(String[] args) {

    String [] animal = {"monkey","rooster","dog","pig","rat","ox","tiger",
                        "rabbit","dragon","snake","horse","sheep"};
    int year = Integer.parseInt(System.console().readLine("\nEnter your year of birth : "));

    int zodiacSign = year % 12;

    System.out.println("Your chinese zodiac is "+animal[zodiacSign]);
  }
}