package class24Encapsulations;

public class Horse {
    String name;
    String breed;
    int age;
    String color;
    double height;

    public Horse(String name, String breed, int age, String color, double height) {
        setName(name);
        setBreed(breed);
        setAge(age);
        setColor(color);
        setHeight(height);
    }

    public String getName() {
        return name;
    }

     void setName(String name) {
        if (name.length() > 15) {
            System.out.println("Name can not be less than 15.Please try again");
        } else if (name.isEmpty()) {
            System.out.println("Please fill the name");
        } else{
                this.name = name;
            }
        }

    public String getBreed() {
        return breed;
    }

void setBreed(String breed) {
    if (breed.equals("Arabian")) {
        System.out.println("This type of horses are especially noted for their endurance");
    } else if (breed.equals("Warmblood")) {
        System.out.println("Warmblood horse is an athletic horse");
    } else {
        this.breed = breed;
    }
}
    int getAge () {
        return age;
    }


     void setAge(int age){
            if(age>40){
                System.out.println("You took good care of it");
            } else{
                this.age = age;

            }
    }

    public String getColor() {
            return color;
        }

    public void setColor(String color) {
        if (color.equals("black")){
            System.out.println("The Horse color is black");
        } else if (color.equals("brown")) {
            System.out.println("The Horse color is brown");
        } else if (color.equals("chestnut")) {
            System.out.println("The Horse color is chestnut");
        } else {
            this.color = color;
        }
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if(height<=160){
            System.out.println("This is the height of an Arabian Horse");
        } else if(height<=173){
            System.out.println("This is the height of a british Horse Shire");
        } else {
        this.height = height;
    }
        }
        void printInfo() {
            System.out.println("Name " + name + " Breed " + breed + " Age " + age + " Height " + height + "Color "+color);
        }
    }
class horseTest {
    public static void main(String[] args) {

        Horse horse = new Horse ("Spirit", "Warmblood",35,"black",172);

        System.out.println(horse.getName());
        System.out.println(horse.getBreed());
        System.out.println(horse.getAge());
        System.out.println(horse.getHeight());
        System.out.println(horse.getColor());
        horse.printInfo();
    }
}
