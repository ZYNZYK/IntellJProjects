package class18This;

public class test1 {
    int num1;
    int num2;
    int num3;
    int num4;

    //Substract(){}

    //Substract(int num1){this.num1=num;}

    void substr (int num1,int num2, int num3, int num4){
        System.out.println(num1-num2-num3-num4+" "+"(should come from subtracting 4 numbers)");
    }
    void subs(int num1,int num2, int num3){
        System.out.println(num1-num2-num3+" "+"(should come from subtracting 3 numbers)");
    }
    void sub(int num1,int num2){
        System.out.println(num1-num2+" "+"(should come from subtracting 2 numbers)");
    }
    public static void main(String[] args) {
        test1 sub = new test1();
        sub.substr(122, 22, 35, 25);
        sub.subs(70,10,30);
        sub.sub(30,10);

    }
}
