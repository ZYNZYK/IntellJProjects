package repls;

public class repl139 {
    public String alphabetical(String str){
        String newStr="";
        for (int i=0; i<str.length()-1; i++){
            if (i==0){
                newStr+=str.charAt(i);
            }
            if(str.charAt(i+1)>str.charAt(i)){
                newStr+=str.charAt(i+1);
            }
        }
        return newStr;
    }

    public static void main(String[] args) {
        repl139 ans=new repl139();
        System.out.println(ans.alphabetical("hello"));
        System.out.println(ans.alphabetical("software"));
        System.out.println(ans.alphabetical("language"));
    }

}
