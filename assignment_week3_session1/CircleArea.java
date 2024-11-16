public class CircleArea {
  public static void main(String[] args) {
    double circleRadius = Double.parseDouble(System.console().readLine("Enter circle radius : "));
    
    if (circleRadius <= 0) {
      System.out.println("Incorrect input");
      
    } else {
      final double bi = 3.14159;
      double area = bi * (circleRadius*circleRadius);
      System.out.println("Circle area = " + area);
    }
  }
}