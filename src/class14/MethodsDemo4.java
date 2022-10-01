package class14;

import java.util.Scanner;

public class MethodsDemo4 {
    boolean isEven(int number){
        if(number%2==0){
            return true;
        }  else {
            return false;
        }
    }

    public static void main(String[] args) {

        MethodsDemo4 md=new MethodsDemo4();

        if(md.isEven(4)){
            System.out.println("Number is Even");
        }else {
            System.out.println("Number is odd");
        }

        Scanner scanner=new Scanner(System.in);
        int number=scanner.nextInt();
    }

}
