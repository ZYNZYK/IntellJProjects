package class14;

public class StringBufferVsBuilder {
    public static void main(String[] args) {
        StringBuilder stringBuilder=new StringBuilder("Today is Java Class");
        StringBuffer stringBuffer=new StringBuffer("Today is java Class");//older and slower
        String str="Jaca is very easy";
        StringBuilder stringBuilder1=new StringBuilder(str);//mostly used class nwer better best


    }
}
