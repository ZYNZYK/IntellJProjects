package GroupTask2;
    /*
    We have to calculate the average of marks
obtained in three subjects by student A and by
student B. Create class 'Marks' with an abstract
method 'getPercentage' that will be returning
the average percentage of marks. Provide
implementation of abstract method in classes
'A' and 'B'. The constructor of student A takes the
marks in three subjects as its parameters and
the marks in four subjects as its parameters for
student B. Test your code
     */

public abstract class Marks{
    abstract  double getPercentage();
}

class StudentA extends Marks{
double grade1;
double grade2;
double grade3;

StudentA(double grade1,double grade2,double grade3){
    this.grade1=grade1;
    this.grade2=grade2;
    this.grade3=grade3;
}
double getPercentage(){
    double percentage=(((grade1+grade2+grade3)/3)*100);
    System.out.println("Average of a Student A is "+percentage+"%");
    return percentage;
}
}
class StudentB extends Marks{
    double grade1;
    double grade2;
    double grade3;
    double grade4;

    StudentB(double grade1, double grade2,double grade3, double grade4) {
        this.grade1 = grade1;
        this.grade2 = grade2;
        this.grade3 = grade3;
        this.grade4 = grade4;
    }

double getPercentage(){
    double percentage=(((grade1+grade2+grade3+grade4)/4)*100);
    System.out.println("Average of a Student B is "+percentage+"%");
    return percentage;
}
}
class TestMarks{
    public static void main(String[] args) {
        Marks[]arr={new StudentA(87,95,92),new StudentB(81,89,90,92)};
        for (Marks obj:arr){
            obj.getPercentage();
        }
    }
}