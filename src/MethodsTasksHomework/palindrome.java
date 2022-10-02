package MethodsTasksHomework;

import java.util.Scanner;

public class palindrome {

   /*
    Create a method that will print whether given String is palindrome or not.
    */
    void word (String str) {
        StringBuilder stringBuilder = new StringBuilder(str);
        stringBuilder.reverse();
        if (stringBuilder.toString().equals(str)) {
            System.out.println("the string is Palindrome");
        } else {
            System.out.println("the string is not Palindrome");

        }
    }
    public static void main (String[]args){
        palindrome str=new palindrome();
        Scanner scanner=new Scanner(System.in);
        String a =scanner.next();
        str.word(a);

}
}