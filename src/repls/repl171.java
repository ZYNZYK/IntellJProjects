package repls;

//public class repl171 {

abstract class test {
    abstract void parameters(String s);
    abstract void noParameters(String s);
}
class tester extends test {
    void parameters() {
        System.out.println("m1 without parameters");
    }

    void noParameters() {
        System.out.println("m1 method with parameter");
    }

    @Override
    void parameters(String s) {

    }

    @Override
    void noParameters(String s) {

    }
}
class repl{

    public static void main(String[] args) {
       tester t = new tester();
        t.parameters();
        t.noParameters();
    }
}