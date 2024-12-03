public class Person {
  protected String name;
  protected String address;
  protected String phoneNumber;
  protected String emailAddress;

  Person(String name,String address,String phoneNumber,String emailAddress){
    this.name = name;
    this.address = address;
    this.phoneNumber = phoneNumber;
    this.emailAddress = emailAddress;
  }
  public String toString(){
    return "Class name : " + getClass().getSimpleName() + " , Person name : " + name ;
  }
}
