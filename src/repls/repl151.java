package repls;

//public class repl151 {
    class Method{
        static int sum2D(int[][] arr){
            int sum=0;
            for(int[]row:arr){
                for(int values:row){
                    sum+=values;
                }
            }
            return sum;
        }

    }

    class repl151 extends Method {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(sum2D(arr));

    }
}