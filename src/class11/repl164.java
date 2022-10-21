package class11;

public class repl164 {

        void hello(){
            System.out.println();
        }
    }
    class Child1 extends repl164{
        void hello(){
            System.out.println("method in Child1 class");
        }
    }
    class Child2 extends repl164{
        void hello(){
            System.out.println("method in Child2 class");
        }
    }
    class Child3 extends repl164{
        void hello(){
            System.out.println("method in Child3 class");
        }
    public static void main (String[]args){

        Child1 ch = new Child1();
        ch.hello();
        Child2 st = new Child2();
        st.hello();
        Child3 str = new Child3();
        str.hello();

    }
}


