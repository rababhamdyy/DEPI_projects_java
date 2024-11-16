public class Assignment5 {
  public static void main(String[] args) {
    int timeInSeconds = Integer.parseInt(System.console().readLine("Please enter the seconds: "));
    System.out.println("You entered : " + timeInSeconds + " seconds");

    int minutes = timeInSeconds / 60;
    int seconds = timeInSeconds % 60;

    System.out.println(timeInSeconds + " seconds = " + minutes + " minutes , " + seconds + " seconds");

  }
}
