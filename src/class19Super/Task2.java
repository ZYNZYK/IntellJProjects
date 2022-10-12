package class19Super;

public class Task2 {
    /*
 Write Book class that will have instance variables and 2 Constructors. While creating an object make sure:
Instance variables are being initialized
Both Constructors are being executed
     */
    public static void main(String[] args) {
        Book headFirstJava=new Book ("HeadFirstJava", "Oreally", 12,133457);
        Book DataStructors=new Book("HeadFirstJava", "Oreally", 12);
    }
}
class Book{
    String name;
    String author;
    int noOfTotalCh;
    int ISBN;

    public Book(String name,String author,int noOfTotalCh,int ISBN){ //CONSTRUCTOR
       // this.name=name;
       // this.author=author;
        this(name, author, noOfTotalCh);
        this.ISBN=ISBN;

    }


    public Book(String name, String author, int noOfTotalCh) {  //CONSTRUCTOR
        this.name=name;
        this.author=author;
        this.noOfTotalCh=noOfTotalCh;
    }
}

