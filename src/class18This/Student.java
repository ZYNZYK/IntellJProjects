package class18This;

public class Student {
   /*
    Write a java Class Students that have a constructor which
    takes students name and 3 subject grades.
    Inside your class also have a method to Calculate Average Grade.
    Test Student class for 5 different students with different marks.
     Your program should print an average mark of each students name.
    */
    String name;  //instance Variables
    double subj1; //instance Variables
    double subj2; //instance Variables
    double subj3; //instance Variables

    Student(String StudentName, double sub1, double sub2, double sub3){  // local variables
        name=StudentName;
        subj1=sub1;
        subj2=sub2;
        subj3=sub3;
    }
    void calculatePrintAvgGrade(){ //its a method
        System.out.println(name+" "+(subj1+subj2+subj3)/3);
    }

    public static void main(String[] args) {
        new Student("Sabah",99,98,97.5).calculatePrintAvgGrade();
    }

}
