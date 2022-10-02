package MethodsTasksHomework;

public class Hello {

   void sayHello (String country) {

       switch (country) {
           case "USA":
               System.out.println("Hi!");
               break;
           case "Moldova":
               System.out.println("Buna ziua!");
               break;
           case "Russia":
               System.out.println("Привет");
               break;
           case "Italy":
               System.out.println("Ciao!");
               break;
           case "Germany":
               System.out.println("Hallo!");
               break;
           case "Turkie":
               System.out.println("Merhaba");
               break;
           case "France":
               System.out.println("Bonjour");
               break;
           default:
               System.out.println("Excuse me!");
               break;
       }
    }


        public static void main (String[]args){
        Hello greet = new Hello();
        greet.sayHello("Moldova");
        greet.sayHello("USA");
        greet.sayHello("Italy");



        }

    }
