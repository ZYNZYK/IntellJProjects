package class24Encapsulations;

import java.util.ArrayList;

public class ArrayListDemo3 {
    public static void main(String[] args) {
        //how we store chars in ArrayList
        ArrayList <Character> chars=new ArrayList<>();
        chars.add('A');
        chars.add('B');
        chars.add('C');
        chars.add('Z');
        chars.add('G');
        System.out.println(chars);


        // how to store boolean
        System.out.println("***************");
        ArrayList<Boolean> booleans=new ArrayList<>();
        booleans.add(false);
        booleans.add(true);
        booleans.add(false);
        System.out.println(booleans);

        //how to store float
        System.out.println("******************");
        ArrayList<Float> floats=new ArrayList<>();
        floats.add(12.5f);
        floats.add(12.6f);
        floats.add(12f);
        floats.add(13.5f);
        System.out.println(floats);

    }
}
