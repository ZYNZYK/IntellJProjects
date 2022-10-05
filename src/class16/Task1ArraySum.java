package class16;

public class Task1ArraySum {
    /*
Create a method that will accept an array as parameters and will return a sum of all elements from that array.
 Method should be visibly only within same package and accessible by the creating an instance of the class.
*/

public int sumNum(int []array){
int sum=0;
for (int i=0;i<array.length;i++){
    sum+=array[i];
}
return sum;

}

    public static void main(String[] args) {
        Task1ArraySum sum=new Task1ArraySum();
        System.out.println(sum.sumNum(new int[]{12,2,35,5}));
    }
 }



