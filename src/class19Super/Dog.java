package class19Super;

public class Dog extends Animal {
    String name;
    String breed;
    String color;

    public Dog (String name, String breed, String color){
        super(name, breed, color);  //CONTRUCTOR was created in the parent class

        /*this.name=name;
        this.breed=breed;
        this.color=color;*/
    }


}

class Cat extends Animal {
    Cat (String name, String breed, String color) {  // create a constructor => () pass the parameters
     super(name,breed,color);


    }
    class TestAnimal {

    }
        public static void main(String[] args) {
            Dog dog =new Dog ("Jack","German","black");
            dog.printInfo();
            }
        }