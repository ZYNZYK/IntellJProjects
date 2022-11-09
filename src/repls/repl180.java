package repls;

class EncapsulationDemo2{
    private String empName;
    private int empAge;

    public EncapsulationDemo2(String name, int age) {
        empName=name;
        empAge=age;
    }
    public int getEmpAge(){
        return empAge;
    }
    public String getEmpName(){
        return empName;
    }

    void printInfo() {
        System.out.println("Name " + empName + " Age " + empAge);
    }
}
class zina {
    public static void main(String args[]){
        EncapsulationDemo2 employee = new EncapsulationDemo2("John",30);
        System.out.println("Employee Name: "+employee.getEmpName());
        System.out.println("Employee Age: "+employee.getEmpAge());
    }
}