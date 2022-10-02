package class12;

public class trimDemo {
    public static void main(String[] args) {

        String str = " i love java ";
        System.out.println(str);
        /*
         * Remove the spaces before and after the String but not the ones which are
         * present in between
         */
        System.out.println(str.trim());

        String str2 = "Java is very easy";

        /*
         * startsWith=> checks if a String starts with a specific letter or word
         * endsWith=> checks if a String Ends with a specific letter or word contains=>
         * checks if a String Contains a specific letter or word
         */
        System.out.println(str2.startsWith("Java")); // "j" <=false java is case sensitive
        System.out.println(str2.endsWith("j")); // y <=true "easy" end with y

        System.out.println(str2.toLowerCase().contains("Very"));

    }

}

