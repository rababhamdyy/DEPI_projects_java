public class LotteryProgram {
  public static void main(String[] args) {
    int randomNum = (int) (Math.random() *90) + 10;
    int inputNum = Integer.parseInt(System.console().readLine("\nGuess a two-digit number : "));

    System.out.println("Input number is : "+ inputNum);
    System.out.println("Random number has been generated is : "+ randomNum);

    int inputOnes = inputNum % 10;
    int inputTens = inputNum / 10;
    int randomOnes = randomNum % 10;
    int randomTens = randomNum / 10;

    Boolean exactOrder = (inputNum == randomNum);
    Boolean allDigits = (inputOnes == randomTens) && (inputTens == randomOnes);
    Boolean oneDigit = (inputOnes == randomOnes) || (inputOnes == randomTens) || 
                      (inputTens == randomOnes) || (inputTens == randomTens);

    if (exactOrder) {
      System.out.println("\nCongrats! you win $10.000\n");
    } else if (allDigits) {
      System.out.println("\nYou win $3.000\n");
    } else if (oneDigit) {
      System.out.println("\nYou win $1.000\n");
    } else {
      System.out.println("\nSorry, no match\n");
    }
 } 
}
