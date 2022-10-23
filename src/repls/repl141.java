package repls;

public class repl141 {
    public static int maxValue(int[] array){
        int maxArr = 0;
        for (int i=0; i< array.length; i++){
            if (array[i]>maxArr){
                maxArr=array[i];
            }
        }
        return maxArr;
    }


    public static void main(String[] args) {
        int[] arr = {5,12,-3,7,3,22};
        System.out.println(maxValue(arr)); //should print 22
    }
}
