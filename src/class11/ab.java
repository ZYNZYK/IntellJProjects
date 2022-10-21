package class11;

class A{
    String str;
    void print1(){
        System.out.println("I");
    }
}
class B extends A {
    String ab;
    void print2(){
        System.out.println("am");
    }
}
class C extends B {
    String cba;
    void print3(){
        System.out.println("a tester");
    }
}
