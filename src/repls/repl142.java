package repls;

public class repl142 {

public static void main(String []args){
        SyntaxTechnologies obj1=new SyntaxTechnologies();
        obj1.printInfo();

        SyntaxTechnologies obj=new SyntaxTechnologies("Syntax", 6, 2020,"07/30/2020");

        obj.printInfo();

    }

    public static class SyntaxTechnologies {
        String schoolName;
        int batch;
        int year;
        String lastDayOfClass;

        SyntaxTechnologies(){

        }
        void printInfo1(){

        }
        SyntaxTechnologies(String school,int batchNo,int Batchyear,String EndOfClass){
            schoolName=school;
            batch=batchNo;
            year=Batchyear;
            lastDayOfClass=EndOfClass;
        }

        void printInfo(){
            System.out.println(schoolName+" "+batch+" "+year+" "+lastDayOfClass);
        }
    }
}
