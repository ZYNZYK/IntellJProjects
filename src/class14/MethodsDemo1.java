package class14;

public class MethodsDemo1 {

    public static class Math{
        void add (int num1,int num2){
            System.out.println(num1+num2);
        }
        void printFiboSeries(int num){

            int previous =0;
            int currentNumber=1;
            int nextNum=0;
            System.out.println(previous);
            System.out.println(currentNumber);
            for (int i=0;i<num;i++){
                nextNum=previous+currentNumber;
                System.out.println(nextNum);
                previous=currentNumber;
                currentNumber=nextNum;

            }
        }

        public static void main(String[] args) {
            Math obj=new Math();//creating an objetc of the math class
            obj.printFiboSeries(5);
            System.out.println("*********************");
            obj.printFiboSeries(10);

            obj.add(10,20);
        }
    }
}
