package class18This;

public class test {
    public static class Math {
        public int num1;
        public int num2;
        String str;
        void add(int num1, int num2) {
            System.out.println("Addition"+" "+(num1+num2));
        }

        void multip(int num1, int num2) {
            System.out.println("Multiplication"+" "+(num1*num2));
        }

        void substr(int num1, int num2) {
            System.out.println("Subtraction"+" "+(num1-num2));
        }
        public static void main(String[] args) {
            Math obj = new Math();
            obj.add(10, 20);
            obj.multip(5, 6);
            obj.substr(30, 10);
        }
    }
}


