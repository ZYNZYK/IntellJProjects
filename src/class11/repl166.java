package class11;
/*
Create a class Animal in which define instance variable type, constructor that will initialize instance variables and 2 methods eat and sleep.

Create a subclass Cat in which override method sleep

Create 3 Kitten subclasses of a Cat class and override method eat

for 1 kitten - eats milk

for 2 kitten - eats snack

for 3 kitten - eats everything

In main method create object of Cat class and all 3 kittens classes and store into an array of Animals. Call available methods:
 */

public class repl166 {
        public static void main(String[]args){
            Cat cat=new Cat("Cat");
            cat.eat();
            cat.sleep();
            Kitten1 obj=new Kitten1("kitten1");
            obj.eat();
            obj.sleep();
            Kitten2 obj1=new Kitten2("kitten2");
            obj1.eat();
            obj1.sleep();
            Kitten3 obj2=new Kitten3("kitten3");
            obj2.eat();
            obj2.sleep();

            Animal[]arr={cat,obj,obj1,obj2};

        }
    }
    class Animal{
        String type;
        Animal(String type){
            this.type=type;
        }
        void eat(){
            System.out.println(type+" eats");
        }
        void sleep(){
            System.out.println(type+" sleep");
        }
    }
    class Cat extends Animal {
        Cat (String type){
            super(type);
        }
        void sleep(){
            System.out.println(type+" sleeps a lot");
        }
    }

    class Kitten1 extends Cat{
        Kitten1(String type){
            super(type);
        }
        void eat(){
            System.out.println(type+" eats milk");
        }
    }
    class Kitten2 extends Cat{
        Kitten2(String type){
            super(type);
        }
        void eat(){
            System.out.println(type+" eats snacks");
        }
    }
    class Kitten3 extends Cat{
        Kitten3(String type){
            super(type);
        }
        void eat(){
            System.out.println(type+" eats everything");
        }
    }
