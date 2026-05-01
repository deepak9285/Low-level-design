// //first i will right the garbage code 
 import java.util.ArrayList;

// class Product{
//     public  int price;
//     public String name;
//     public Product(int price,String name){
//         this.price=price;
//         this.name=name;
//     }
// }

// class shoppingCart{
//     private ArrayList<Product>products;
//     public shoppingCart() {
//         products = new ArrayList<>();
//     }
//     public void addProducts(Product p){
//         products.add(p);
//     }
//     public double totalPrice(){
//         double totalPrice=0;
//         for(Product p:products){
//             totalPrice+=p.price;
//         }
//         return totalPrice;
//     }
//     public void printInvoice(){
//         System.out.println("Shopping cart invoice is avialable");
//         for(Product p:products){
//             System.out.println("this product"+p.name+"name "+p.price);
//         }
//         System.out.println("Total avaible ampiu is"+totalPrice());
//     }
//     public void saveToDB(){

//     }
// }
// class Main{
//     public static void main(String[]args){
//        shoppingCart c=new shoppingCart();
//        c.addProducts(new Product(25,"deel"));
//        c.addProducts(new Product(90,"abcd"));
//        c.printInvoice();
       
//     }
// }


//This code is using single responsiblity principle

class Product{
    public  int price;
    public String name;
    public Product(int price,String name){
        this.price=price;
        this.name=name;
    }
}
class shoppingCart{
    private ArrayList<Product>products;

    public shoppingCart() {
        products = new ArrayList<>();
    }
    public void addProducts(Product p){
        products.add(p);
    }
    public ArrayList<Product> getProducts(){
        return products;
    }
    public double totalPrice(){
        double totalPrice=0;
        for(Product p:products){
            totalPrice+=p.price;
        }
        return totalPrice;
    }
}
class shoppingCartInvoiceGenerator{
    shoppingCart cart;
    shoppingCartInvoiceGenerator(shoppingCart cart){
        this.cart=cart;
    }
    public void printInvoice(){
        System.out.println("Shopping cart invoice is avialable");
        for(Product p:cart.getProducts()){
            System.out.println("this product"+p.name+"name "+p.price);
        }
        System.out.println("Total avaible ampiu is"+cart.totalPrice());
    }
}

class DBStorage{
    shoppingCart cart;
    DBStorage(shoppingCart cart){
        this.cart=cart;
    }
    public void saveToDB(){
        System.out.println("Saving to Database");

    }
}
class Main{
    public static void main(String[] args) {
        shoppingCart c=new shoppingCart();
        c.addProducts(new Product(20,"dell"));
        c.addProducts(new Product(90, "sdfsdf"));
        shoppingCartInvoiceGenerator invoice=new shoppingCartInvoiceGenerator(c);
        invoice.printInvoice();
        DBStorage db=new DBStorage(c);
        db.saveToDB();
    }
}