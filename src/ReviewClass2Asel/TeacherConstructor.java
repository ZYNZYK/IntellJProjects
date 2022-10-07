package ReviewClass2Asel;

public class TeacherConstructor {
    String name, lastName; //Instance variables
    int experience;
    String subject;
    double salary;

    static String school; //all my teachers work in the same school that's why its STATIC,isn't changing

    //how to create a CONSTRUCTOR???
    /*
    1. constructor name = classname ,SUPPOSED TO BE THE SAME AS MY CLASS
    2.no return type not even VOID
    !!! When we do not create a constructor =>> compiler creates a default constructor for us
     */

    //using below constructor we initialize Instance variables
    TeacherConstructor(String fname, String lName) { //this is the class name(TeacherConstr)
            name = fname; //local variables == Instance variable
            lastName = lName;
        //when you create a constructor compiler is NOT going to create
        //a default constructor for you
    }
        void print () {
            System.out.println(name + " " + lastName);
        }


    }


