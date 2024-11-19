public class Circle {
  private double radius;

  Circle(){}
  Circle(double newRadius){
    this.radius = newRadius;
  }

  public double getArea(){
    double circleArea = (Math.PI) * (Math.pow(radius, 2));
    return circleArea;
  }

  public double getPerimeter(){
    double circlePerimeter = 2*(Math.PI)*radius;
    return circlePerimeter;
  }

  public void setRedius(double newRadius){
    this.radius = newRadius;
  }
}
