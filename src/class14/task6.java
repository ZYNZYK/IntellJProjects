package class14;

public class task6 {
    public static void main(String[] args) {
        String str1="python";
        String str2="java";
        str1=str1+str2;
        str2=str1.replace(str2,"");
        str1=str1.replace(str2,"");

        System.out.println(str1);
        System.out.println(str2);


    }

    }
