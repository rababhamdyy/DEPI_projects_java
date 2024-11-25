public class AnswerQ {

  public static void main(String[] args) {
    int digit1 = (int) (Math.random() *10);
    int digit2 = (int) (Math.random() *10);
    
    int inputAnswer;
    int correctAnswer = (digit1 + digit2);

    do {
      inputAnswer = Integer.parseInt(System.console().readLine("What is "+digit1+" + "+digit2+" ? "));

      if (inputAnswer != correctAnswer) {
        System.out.println("Wrong answer. Try again. ");
      }
    } while (inputAnswer != correctAnswer);

    System.out.println("You got it!");

  }
}