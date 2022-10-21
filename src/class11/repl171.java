package class11;

public class repl171 {
    class Main extends Parent {
        void parameters(){
            System.out.println("m1 without parameters");}
        void noParameters(){
            System.out.println("m1 method with parameter");}
    }
    public static void main(String[]args){
 }
    public abstract class Parent{
        abstract void parameters();
        abstract void noParameters();


    }

}
