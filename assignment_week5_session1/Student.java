public class Student extends Person{
  protected static final String freshman = "freshman"; 
  protected static final String junior = "junior"; 
  protected static final String senior = "senior"; 
  protected String status = "status";

  Student(String name,String address,String phoneNumber,String emailAddress, String status){
    super(name, address, phoneNumber, emailAddress);
    this.status = status;
  }

  @Override
  public String toString() {
    return super.toString();
  }
}
