package ReviewClass2Asel;

public class Dog {
    String name; //instance variable
    int weight; //instance variable
    static String breed; //static

    void printInfo() { //name of the method
        System.out.println("Dog features:" + name + ", " + weight + ", " + breed);
    }

    /* createa a method to return the price

  if weight is more than 5 =>100
  if weight is more than 10=>300
  if weight is more than 20=>
 */
    double getPrice() {
        if (weight < 5) {
            return 100;
        } else if (weight < 10) {
            return 300;
        } else {
            return 1000;
        }
    }
    //create a method that will return bark type

    // if weight is more less than 5 ==> loud
    //if weight less 20 => noice is wooh
    //if weight is less 500 =>> noice gav gav

    String bark() { // local to its lock of code

        String noise; // local variable, we define it inside the block of code
        if (weight < 5) {
            noise = "loud";
        } else if (weight < 20) {
            noise = "woof woof";
        } else {
            noise = "Gav gav";
        }
        return noise; // we return noise because it wil return "loud/ woof woof/gav gav'

        //create a method love
    }
        void love (String thing) { // do not return anything, thing is a string value as a parameter
            System.out.println(name +" loves "+ thing);
        }
    }




