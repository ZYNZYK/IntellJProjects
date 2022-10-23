package repls;

public class repl145 {
    public static void main(String[]args){
        Dog dog1=new Dog ("Tarzan", 50.0);
        dog1.printDogInfo();
        Dog dog2=new Dog("Lucy",10.0);
        dog2.printDogInfo();
    }
}
class Dog{

    String dogName;
    double dogWeight;
    static String dogBreed="Mutt";

    Dog (String dogName,double dogWeight){
        this.dogName=dogName;
        this.dogWeight=dogWeight;

    }

    void printDogInfo(){
        System.out.println(dogName+" "+dogBreed+" "+dogWeight);
    }
}

