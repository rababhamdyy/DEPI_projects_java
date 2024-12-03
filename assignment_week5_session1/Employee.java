public class Employee extends Person{
  protected String office;
  protected int salary;

  Employee(String name,String address,String phoneNumber,String emailAddress,String office,int salary){
    super(name, address, phoneNumber, emailAddress);
    this.office = office;
    this.salary = salary;
  }
  @Override
  public String toString() {
    return super.toString();
  }
}
