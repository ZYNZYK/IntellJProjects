package ReviewClass4Polimorph;

public class Fruits {
    protected String name;
    String shape;
    private String color;

    public static boolean fresh;

    public Fruits(String name) {
        this.name = name;
    }

    Fruits(String name, String shape, String color) {
        this(name);
        this.shape = shape;
        this.color = color;
    }

    void grow() {
        System.out.println("All fruits grow fresh " + fresh);
    }

    public static void havePeel() {
        System.out.println("All fruits need to be peeled");
    }

    protected void haveBenefits() {
        System.out.println("All fruits good for your health");
    }
}
