package repls;

public class repl161 {
    private static String m1;
    private static String m2;

    void str(String m1){System.out.println("private m1 method ");}
    void str1(String m2){System.out.println("private m1 method with int parameter");}
    public static void main(String[]args){
        repl161 obj=new repl161();
        obj.str(m1);
        obj.str1(m2);
    }
}