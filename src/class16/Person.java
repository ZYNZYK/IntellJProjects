package class16;

public class Person {
   private String password="pass 1234";
  public double salary=10000; //by adding public we can access everywhere, without only in the same package
/*
default throughout classes in the same package
public throughout packages in the same project
private only a single class
 */

    public static void main(String[] args) {
      Person  person1=new Person();
        System.out.println(person1.password);
        System.out.println(person1.salary);

    }

}
