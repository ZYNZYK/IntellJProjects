package repls;

//public class repl179 {
    class EncapsulationDemo1{
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
    public class repl179{
        public static void main(String args[]){
            EncapsulationDemo obj = new EncapsulationDemo();
            obj.setEmpName("Mario");
            obj.setEmpAge(32);
            System.out.println("Employee Name: " + obj.getEmpName());
            System.out.println("Employee Age: " + obj.getEmpAge());
        }
    }
