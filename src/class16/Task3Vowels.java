package class16;

public class Task3Vowels {
/*
Create a method that will accept a String as a parameter and return a new String that consist only of vowels.
Method should be available inside the class only where it was declared and executed by calling it is name.
 */
    private String Word (String onlyVowels){
        return onlyVowels.replaceAll("[^aeiou]","");
    }

    public static void main(String[] args) {
        Task3Vowels vow =new Task3Vowels();
        System.out.println(vow.Word("parallelogram").toLowerCase());
    }
}
