package MethodsTasksHomework;

public class largerNumber {
    /*
    Create a method that will take 2 parameters as a numbers and prints which number is larger.
     */
    public static class largeNumber {

        void large(int num1, int num2) {
            if (num1 > num2) {
                System.out.println(num1 + " os greater than " + num2);
            } else {
                System.out.println(num2 + " is greater than " + num1);
            }
        }
        public static void main(String[] args) {

            largeNumber Num = new largeNumber();
             Num.large(25,45);
        }



    }
}


