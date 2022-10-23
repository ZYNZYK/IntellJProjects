package GroupTask2;

public class CarTask3 {
    double carPrice;
    String color;
    public void calculateSalePrice() {
        System.out.println("The car Price is " + carPrice);
    }
}
class Truck extends CarTask3 {
    double weight;
   double discount=carPrice*0.10;
  // newPrice=carPrice-discount;

    public void carPrice() {
        if (weight > 2000) {
            discount = 10;
            System.out.println(carPrice-(carPrice *0.10));
        } else {
            discount = 20;
            System.out.println(carPrice-(carPrice *0.20));
        }
    }

    }
          class Sedan extends CarTask3{
                double length;
                double discount;
                void carPrice(){
                    if(length>20){
                        discount=5;
                        System.out.println(carPrice-(carPrice*0.95));
                    }else{
                        discount=10;
                        System.out.println(carPrice-(carPrice*0.9));
                    }
                }

              }
              class Tester {
                  public static void main(String[] args) {
                      Truck truck=new Truck();
                      truck.weight=2500;
                      truck.carPrice=750000;
                      truck.carPrice();
                      Sedan sedan=new Sedan();
                      sedan.length=25;
                      sedan.carPrice=5500;
                      sedan.carPrice();
                  }
              }