package repls;

public class repl137 {
    private String name;
    public String city;
    protected String nameSchool;
    int batchNo;
    void display(){
        System.out.println("My name is "+name+" and I live in "+city+". I study at "+nameSchool+" in batch "+batchNo);
    }

    public static void main(String[] args) {
        repl137 ans=new repl137();
        ans.name="John";
        ans.batchNo=9;
        ans.city="Miami";
        ans.nameSchool="Syntax";
        ans.display();
    }
}

