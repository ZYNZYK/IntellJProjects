package class16;

public class Task2ReverseWord {
/*
Create a method that will take a String as a parameter and returns reversed String.
Method should be available to all classes within your project and accessible by class name.
 */
    public String reverseWord(String word) {

        StringBuilder strB = new StringBuilder(word);
        strB.reverse(); //wrong way
        System.out.println(strB);
        return word;
    }


    public static void main(String[] args) {
        Task2ReverseWord str=new Task2ReverseWord();
        System.out.println(str.reverseWord("Java is so Hard!"));
    }
}
