public class Rectangle {
  double width = 1;
  double height = 1;

  Rectangle(){}
  // overloading
  Rectangle(double width ,double height){
    this.width = width;
    this.height = height;
  }

  public double getArea(){
    double rectangleArea = width * height;
    return rectangleArea;
  }

  public double getPerimeter(){
    double rectanglePerimeter = 2 * (width + height); 
    return rectanglePerimeter;
  }
}
