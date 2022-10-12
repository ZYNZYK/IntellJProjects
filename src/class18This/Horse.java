package class18This;

public class Horse {
    String name;
    int age;
    double weight;
    String breed;

    public Horse(String name, String breed, int age,double weight){
        this.name=name; //name=name java don't understand what name to use thats why we need => this.
        this.breed=breed;
        this.weight=weight;
        this.age=age;

    }
void printInfo(){
    System.out.println("name "+name+" breed "+breed+"age "+age+" Weight "+weight);
}

    public static void main(String[] args) {
        Horse horseObj=new Horse("Spirit","Arabian ",20,400);
        horseObj.printInfo();
    }
}
