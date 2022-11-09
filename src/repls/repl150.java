package repls;

//public class repl150 {
    class Person{
        String name;
        String lastName;
        int age;
        Person(String name,String lastName,int age){
            this.name=name;
            this.lastName=lastName;
            this.age=age;
        }
    }
    class Employee extends Person{
        int salary;
        Employee(String name,String lastName,int age,int salary){
            super(name,lastName,age);
            this.salary=salary;
        }
        void printEmployee(){
            System.out.println(name+" "+lastName+" "+age+" "+salary);
        }
    }
    class Student extends Employee{
        int grade;
        Student(String name,String lastName,int age,int salary,int grade){
            super(name,lastName,age,salary);
            this.grade=grade;
        }
        void printStudent(){
            System.out.println(name+" "+lastName+" "+age+" "+grade);
        }
    }
    class Retiree extends Student{
        String seniorActivity;
        Retiree(String name,String lastName,int age,int salary,int grade,String seniorActivity){
            super(name,lastName,age,salary,grade);
            this.seniorActivity=seniorActivity;
        }
        void printRetiree(){
            System.out.println(name+" "+lastName+" "+age+" "+seniorActivity);
        }
    }
    class Main{
        public static void main(String[] args){
            Employee obj1=new Employee("Joe","Smith",35,35000);
            Student obj2=new Student("Adam","Smith",15,0,10);
            Retiree obj3=new Retiree("Frank","Smith",15,25,00000,"tour");
            obj1.printEmployee();
            obj2.printStudent();
            obj3.printRetiree();
        }
        }
