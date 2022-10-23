package repls;

public class repl148 {
        public static void main(String[]args){
            ShoppingStore shoppingStore=new ShoppingStore("Blanket", 99.98,1);
            shoppingStore.printAll();
            ShoppingStore shoppingStore2=new ShoppingStore("Mattress",439.18,1);
            shoppingStore2.printAll();
            System.out.println("You purchased "+ (shoppingStore.itemTotalPrice()+ shoppingStore2.itemTotalPrice())+" Today");
        }
    }
class ShoppingStore{

    String item;
    double price;
    int quantity;

    public ShoppingStore(String item, double price, int quantity){
        this.item=item;
        this.price=price;
        this.quantity=quantity;
    }
    public double itemTotalPrice(){
        double totalPrice=(quantity*price);
        return totalPrice;
    }
    public void printAll(){
        System.out.println(item + " Total Value "+itemTotalPrice());
    }
}