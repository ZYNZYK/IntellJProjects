package repls;

public class repl133 {
    static int countA (String s) {
        String str=" ";
        int newStr=0;
        str=s.toLowerCase().replaceAll("[^aA]","");
        newStr+=str.length();
        return newStr;

    }
    //test case below (dont change):
    public static void main(String[] args) {
        System.out.println(countA("aaA")); //3
        System.out.println(countA("aaBBdf8k3AAadnklA")); //6

    }
}

