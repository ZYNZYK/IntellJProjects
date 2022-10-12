package class19Super;
public class aaa {
    //Write program for multilevel inheritance where class C inherits from class B and Class B inherits from Class A.
    //Write program to inherit class A that has method printF which is static and call or reuse that method into class B
    String name;
    int age;
    aaa(String name, int age){
        this.name=name;
        this.age=age;
    }

}
class b extends aaa{

    String city;
    b(String name, int age,String city) {
        super(name, age);
        this.city=city;
    }
}
class c extends b{
    String address;
    c(String name, int age, String city,String address) {
        super(name, age, city);
        this.address=address;
    }
    void display(){
        System.out.println(name+" "+age+" "+city+" "+address);
    }
}
class testabc{
    public static void main(String[] args) {
        c obj=new c("talha", 25,"Wah", "Street 3");
        obj.display();

    }
}
