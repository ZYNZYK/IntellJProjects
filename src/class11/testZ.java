package class11;

public abstract class testZ {
    abstract void parameters(String s);
    abstract void noParameters(String s);
}
class shop extends testZ {
    void parameters() {
        System.out.println("m1 without parameters");
    }

    void noParameters() {
        System.out.println("m1 method with parameter");
    }

    @Override
    void parameters(String s) {

    }

    @Override
    void noParameters(String s) {

    }

    public static void main(String[] args) {
        shop str = new shop();
        testZ z = null;
        str.parameters("m1 without parameters\n");
        str.noParameters("m1 method with parameter\n");
    }
}