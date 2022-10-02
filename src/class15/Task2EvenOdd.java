package class15;

public class Task2EvenOdd {
    /*
    print number is even or odd=>print=>using void
     */

    void printEvenOdd(int number){
        if(number%2==0){
            System.out.println(number +" is Even");
        } else {
            System.out.println(number +" is Odd");
        }
    }
    public static void main (String[]args) {
        Task2EvenOdd task=new Task2EvenOdd();
                task.printEvenOdd(45);
                task.printEvenOdd(50);
    }
}
