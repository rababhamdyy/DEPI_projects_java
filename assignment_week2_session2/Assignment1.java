public class Assignment1 {

  public static void main(String[] args) {
  
    int number = Integer.parseInt(System.console().readLine("Please enter an integer: "));
    System.out.println("You entered: " + number);
    
    //multiple of 5
    if (number % 5 == 0) {
      System.out.println("HiFive");
    }
    //divisible by 2
    if (number % 2 == 0) {
      System.out.println("HiEven");
    }

  }
}