package MethodsTasksHomework;

import java.util.Scanner;

public class EvenOdd {

    public static class EvenOrOdd {

        void evenNumber(int num) {


            if (num % 2 == 0) {
                System.out.println(num + " is even");
            } else {
                System.out.println(num + " is odd");
            }
        }

        public static void main(String[] args) {
          EvenOrOdd obj = new EvenOrOdd();
          System.out.println("Enter the number");
            Scanner scanner=new Scanner(System.in);
            int number=scanner.nextInt();
            obj.evenNumber(number);

        }
    }
}