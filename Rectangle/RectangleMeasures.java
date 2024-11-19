public class RectangleMeasures {
  public static void main(String[] args) {
    Rectangle rectangle1 = new Rectangle(4, 40);

    System.out.println("\nRectangle 1 : Width = " + rectangle1.width 
    + " , Height = " + rectangle1.height + " , Area = " + rectangle1.getArea() 
    + " , Perimeter = " + rectangle1.getPerimeter());

    Rectangle rectangle2 = new Rectangle(3.5, 35.9);

    System.out.println("\nRectangle 2 : Width = " + rectangle2.width 
    + " , Height = " + rectangle2.height + " , Area = " + rectangle2.getArea() 
    + " , Perimeter = " + rectangle2.getPerimeter());
  }
}
