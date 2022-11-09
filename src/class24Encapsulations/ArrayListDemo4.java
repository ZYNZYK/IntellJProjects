package class24Encapsulations;

import java.util.ArrayList;

public class ArrayListDemo4 {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        names.add("Tymur");
        names.add("Salma");
        names.add("MJ");
        names.add("Josh");

        //we can  replace and add a new name but changing the index
        names.add(2,"Josh Again");
        System.out.println(names);

        System.out.println("********************");
        //setting/replacing one element with another element
        names.set(3,"Josh Again");
        System.out.println(names);

        System.out.println("**********************************");
        ArrayList<Integer> numbers =new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(1,100);
        System.out.println(numbers);

        System.out.println("*************************");
        numbers.set(3,55);
        System.out.println(numbers);

        System.out.println("**********************");
        numbers.clear(); // deletes all the elements from a list
        System.out.println(numbers);

    }
}
