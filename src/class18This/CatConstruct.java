package class18;

public class CatConstruct {
    private String name;
    private String breed;
    private int age;
    private double weight;

    //  public CatConstruct () //the constructor
    // System.out.println("Cats constructor is called");

    public CatConstruct(String catName, String catBreed, int catAge, double catWeight) {
        name = catName;
        breed = catBreed;
        age = catAge;
        weight = catWeight;
        {
        //    public void printInfo () {
            System.out.println("Name" + name + "Breed" + breed);
        }
        }
    }

