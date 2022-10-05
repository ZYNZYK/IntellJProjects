package class16;

public class Student {

        String name;
        String id;
     static int numberOfStudent;

     public static void main(String[] args) {

        Student roman=new Student();
        roman.id="1";
        roman.name="Roman";
        roman.numberOfStudent++;

         Student sonamKapor=new Student();
         roman.id="2";
         roman.name="Sonam";
         roman.numberOfStudent++;

         System.out.println(sonamKapor.numberOfStudent);
         System.out.println(roman.numberOfStudent);


     }
}
