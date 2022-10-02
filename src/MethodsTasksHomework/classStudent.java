package MethodsTasksHomework;

public class classStudent {
/*
when you use void method you don't need return
 */
    void grade (int number){

        if (number>90 && number<=100) {
            System.out.println("The grade is A");
        } else if(number>80 && number<=80) {
            System.out.println("The grade is B");
        } else if (number>70 && number<=70) {
            System.out.println("The grade is C");
        } else if (number>50 && number<=50) {
            System.out.println("The graDe is D");
        } else{
            System.out.println("The grade is F");
    }

        }
        public static void main (String[]args){
        classStudent number = new classStudent();
        number.grade(100);


        }
}
