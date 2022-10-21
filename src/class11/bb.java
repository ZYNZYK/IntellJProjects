package class11;

public class bb {
    String model;
    double price;
    int quantity;
    void CarObjects(String model, double price, int quantity){
        this.model=model;
        this.price=price;
        this.quantity=quantity;
    }
    void carStockValue(){
        System.out.println(model+" Toyota 2019 Stock Value"+price+quantity );
    }
}
