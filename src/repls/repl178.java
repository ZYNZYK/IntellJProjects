package repls;

    class EncapsulationDemo{
        private String empName;
        private int empAge;

        public int getEmpAge(){
            return empAge;
        }

        public void setEmpAge(int newValue){
            empAge = newValue;
        }
        public void setEmpName(String newValue){
            empName = newValue;
        }

        public String getEmpName(){
            return empName;
        }
    }
public class repl178{
    public static void main(String args[]){
        EncapsulationDemo obj = new EncapsulationDemo();
        obj.setEmpName("John");
        obj.setEmpAge(30);
        System.out.println("Employee Name: " + obj.getEmpName());
        System.out.println("Employee Age: " + obj.getEmpAge());
    }
}