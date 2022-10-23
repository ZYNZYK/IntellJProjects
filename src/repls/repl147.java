package repls;

public class repl147 {
    public static void main (String []args){
        CarObjects car1 = new
                CarObjects("Toyota", 50000.0,50) ;
        car1.carStockValue();
        CarObjects car2 = new CarObjects("BMW",  65298.0,10);
        car2.carStockValue();

    }
}
class CarObjects{
    String model;
    double price;
    int quantity;

    CarObjects(String model, double price,int quantity){
        this.model=model;
        this.price=price;
        this.quantity=quantity;
    }
    void carStockValue(){
        System.out.println(model+" 2019 Stock Value "+price*quantity );
    }
}