package repls;

public class repl149 {
    public static void main(String []args){
        A a= new A();
        a.print1();
        B b=new B();
        b.print2();
    }
}

 class A{

    String str1;
    void print1(){
        System.out.println("Class A");
    }
}
class B extends A{
    String str;
    void print2(){
        System.out.println("Class B");
    }
}
