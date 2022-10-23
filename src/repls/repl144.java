package repls;

public class repl144 {
    public static void main(String [] args){

        StoreProduct obj=new StoreProduct("Eggs", 3.0, "Produce", true, 10);
        obj.display();

        StoreProduct ob1=new StoreProduct ("Paper Towels", 2.0, 24);
        ob1.display();

        StoreProduct objr2=new StoreProduct ( "Paper Towels", 2.0);
        objr2.display();



    }

    public static class StoreProduct {
            String lable;
            double price;
            String category;
            boolean hasExpiration;
            int stock;
            StoreProduct(String lable, double price, String category, boolean hasExpiration, int stock){
                this.lable=lable;
                this.price=price;
                this.category=category;
                this.hasExpiration=hasExpiration;
                this.stock=stock;
            }
            StoreProduct(String lable, double price, int stock){
                this.lable=lable;
                this.price=price;
                this.stock=stock;
                this.category="misc";
                this.hasExpiration=false;
            }
            StoreProduct(String lable, double price){
                this.lable=lable;
                this.price=price;
                this.stock=0;
            }
            public void display(){
                System.out.println(lable +" "+ price +" "+ category +" "+ hasExpiration +" "+ stock);
            }
        }
}
