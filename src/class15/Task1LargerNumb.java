package class15;

public class Task1LargerNumb {
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
        Task1LargerNumb task1 = new Task1LargerNumb();
        task1.printLarger(12,36);
        task1.printLarger(34,77);
    }


}
