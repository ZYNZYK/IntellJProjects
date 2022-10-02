package class15;

import java.util.Scanner;

public class LargerNumScanner {
        /*
        Create a method that will take 2 parameter
        as a number and prints which number is larger-- a hint, to make sure if we need VOID is telling us the word"print"
         */
        void printLarger (int num1, int num2){
            if(num1>num2){
                System.out.println("num 1 is larger "+num1);
            } else if (num2>num1){
                System.out.println("num 2 is larger "+num2);
            } else {
                System.out.println("Numbers are equal");
            }
        }
        public static void main (String[]args){
            Scanner scanner=new Scanner(System.in);
            System.out.println("Please enter the 1st number");
            int num1= scanner.nextInt();
            System.out.println("Please enter number 2");
            int num2= scanner.nextInt();

           Task1LargerNumb task1 = new Task1LargerNumb();
           task1.printLarger(num1,num2);
          //task1.printLarger(12,36);
            //task1.printLarger(34,77);
        }


    }
