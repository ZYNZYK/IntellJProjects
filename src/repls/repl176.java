package repls;

public class repl176 {
    static class Main implements ChildInterface {

        public void parentMethod() {
            System.out.println("Parent Method-welcome to Syntax");
        }

        public void childMethod() {
            System.out.println("Child Method-hello Syntax");
        }

        public static void main(String[] args) {
            ChildInterface obj = new Main();
            obj.parentMethod();
            obj.childMethod();
        }
    }

    interface ParentInterface {
        void parentMethod();
    }

    interface ChildInterface extends ParentInterface {
        void childMethod();
    }
}