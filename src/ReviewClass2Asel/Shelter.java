package ReviewClass2Asel;

public class Shelter {
    public static void main(String[] args) {
        //accessing static-use class name
        Dog.breed="Husky";
        Dog dog1=new Dog();
       // how to access instance variables? throught object variable
        dog1.name="Bobby";
        dog1.weight=10;

        Dog dog2=new Dog();
        System.out.println(dog2.name);
        dog2.name="Tommy";
        dog2.weight=30;
        System.out.println(dog2.name);
        dog2.printInfo();

        dog1.name="Lucky";
        dog1.breed="german";

        dog1.printInfo(); //by changing the static variable will affect other values class23.example dog2 nd you can mess up
        // do not change the static variables ,it will affect the instance variables,all of them

        double price=dog1.getPrice();
        System.out.println(price);

        double price2 = dog2.getPrice();
        System.out.println(price2);

        System.out.println(dog1.bark());
        System.out.println(dog2.bark());

        dog1.love("to swim"); //we created a method love and passing the string value
        dog2.love("to play"); // line 34 and 35, the value what pass is calling an argument


        }


        }