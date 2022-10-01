package class14;

public class MethodsDemo2 {

    // method that does not take any parameters and prints some lines on the console
    void printHello(){ //paranth are empty,==>>> we are defining a method
        System.out.println("Hello WORLD");
        System.out.println("Hello Java");
        System.out.println("Hello Alladin");
    }
    void printWord (String word){ //a method that takes a single parameter of type String and prints it
        System.out.println(word);
    }
    public static void main (String[]args ){
        MethodsDemo2 obj=new MethodsDemo2();
        obj.printHello();// as above are empty
        obj.printWord("dont' worry its java"); // string variable as line 9

        //that is different case.In that case when you define
        // that method you declared two variables inside ().
        // so you have to pass those values when you call it.

    }

}
