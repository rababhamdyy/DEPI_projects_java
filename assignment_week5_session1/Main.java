public class Main {

  public static void main(String[] args) {
    Person person = new Person("Rabab", "Damietta", "010", "rabab@gmail.com");
    Student student = new Student("Reem", "Cairo", "011", "reem@gmail.com", Student.junior);
    Employee employee = new Employee("Rana", "Alex", "012", "rana@gmail.com", "floor 1", 5000);

    System.out.println(person.toString());
    System.out.println(student.toString());
    System.out.println(employee.toString());
  }
}