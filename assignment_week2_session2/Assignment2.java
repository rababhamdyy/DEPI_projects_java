public class Assignment2 {
  public static void main(String[] args) {
    boolean outOfStock = false;
    String message = "Do you want to add this to shopping cart ?";
    int quantity = 5;
    double price = 20;

    if(quantity > 1){
      message = "Your order done";
    }

    if (outOfStock) {
      System.out.println("This item is out of stock");
    } else{
      System.out.println(message);
      double totalCost = quantity * price;
      System.out.println("Total cost = " + totalCost);
    }
  }
}
