package class16;

public class task1Tester {
    public static void main(String[]args){
        SyntaxEmployee zinaEmp=new SyntaxEmployee();
        zinaEmp.empId="123";
        zinaEmp.salary=100000;

        //SyntaxEmployee.CEO="Asel";
        SyntaxEmployee moazzamEmp=new SyntaxEmployee();
        moazzamEmp.empId="123";
        moazzamEmp.salary=100000;

        System.out.println(SyntaxEmployee.CEO);
    }
}
