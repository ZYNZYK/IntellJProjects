package class11;
class a {

static int countVowels(String s){
        String str="";
        int newStr = 0;
        str =  s.toLowerCase().replaceAll("[^aeiou]", "");
        newStr+=str.length();
        return newStr;
        }
//test case below (dont change):
public static void main(String[] args){
        System.out.println(countVowels("obama")); //3
        System.out.println(countVowels("happy friday! i love weekends")); //9
        }
        }