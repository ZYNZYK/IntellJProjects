package repls;

   public class repl152 {

        public static void main(String[] args){

            Child obj = new Child("Vienna");

        }

    }
  class Child extends Parent {

        Child(String city) {
            super(city);
        }

    }
    class Parent {

        String city;

        Parent(String city) {
            System.out.println(city);
            this.city=city;
        }

        Parent() {
            System.out.println("Parent Constructor");
        }

    }