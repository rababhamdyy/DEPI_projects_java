public class CircleMeasures {
 public static void main(String[] args) {
  
  // Circle_1
  Circle circle1 = new Circle();
  circle1.setRedius(1);
  
  System.out.println("\nArea of circle 1 = " + circle1.getArea());
  System.out.println("Perimeter of circle 1 = " + circle1.getPerimeter());

  // Circle_2
  Circle circle2 = new Circle(25);

  System.out.println("\nArea of circle 2 = " + circle2.getArea());
  System.out.println("Perimeter of circle 2 = " + circle2.getPerimeter());

  // Circle_3
  Circle circle3 = new Circle(125);

  System.out.println("\nArea of circle 3 = " + circle3.getArea());
  System.out.println("Perimeter of circle 3 = " + circle3.getPerimeter());
 }
}
