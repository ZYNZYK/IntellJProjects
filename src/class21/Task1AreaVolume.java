package class21;

public class Task1AreaVolume {
    /*
    /*Create 1 class in which create a methods that will calculate the area (volume in case of box) of
      Rectangle, Square, Box
      Use separate class to test your code
     */

    public static void main(String[] args) {
        AreaManager areaManager=new AreaManager();
        areaManager.calculateArea(10,14);
        areaManager.calculateArea(10,12);
        areaManager.calculateVolume(12,5,9);
    }
}
class AreaManager{
    void calculateArea(double length, double width){ //method name
        System.out.println(length*width);
    }
    void calculateArea(double length){
        System.out.println(length*length);
    }
    void calculateVolume(double length, double height, double width){
        System.out.println(length*width*height);
    }
}
