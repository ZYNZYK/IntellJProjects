package class24Encapsulations;

import java.util.Arrays;

public class ArrayListExample {
    public static void main(String[] args) {
    //if we need more than 2 value we use array
        String[] names={"Josh","Adam","Joe"};

        /*
       array length is fixed in size thats why its an issue if we don't know how many value we have
       in this way we are using ArrayList and we have a lot of methods that we can simply use it
       example color.(a list will display)
         */
        String [] breeds=new String[10];
        breeds[0]="BullDogs";
        System.out.println(Arrays.toString(breeds));
        java.util.ArrayList<String> colors =new java.util.ArrayList<>();
        colors.add("Green");
        colors.add("Red");
        System.out.println(colors);

    }
}
