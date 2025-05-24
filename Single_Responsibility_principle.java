import java.util.ArrayList;
import java.util.List;

class Product {
    public String name;
    public double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
}

// Only responsible for Cart related business logic
class ShoppingCart {
    private List<Product> products = new ArrayList<>();
    
    public void addProduct(Product p) {
        products.add(p);
    }

    public List<Product> getProducts() {
        return products;
    }

    public double calculateTotal() {
        double total = 0;
        for (Product p: products) {
            total += p.price;
        }
        return total;
    }
}

// Only responsible for printing incvoices
class ShoppingCartPrinter {
    private ShoppingCart cart;

    public ShoppingCartPrinter(ShoppingCart cart) {
        this.cart = cart;
    }

    public void printInvoice() {
        System.out.println("Shopping Cart Invoice:");
        for (Product p: cart.getProducts()) {
            System.out.println(p.name + " - Rs." + p.price);
        }
        System.out.println("Total: Rs." + cart.calculateTotal());
    }
}

// Only responsible for saving to DB
class ShoppingCartStorage {
    private ShoppingCart cart;

    public ShoppingCartStorage (ShoppingCart cart) {
        this.cart = cart;
    }

    public void saveToDB () {
        System.out.println("Saving shopping cart to DB.");
    }
}

public class Single_Responsibility_principle {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        
        cart.addProduct(new Product("Laptop", 50000));
        cart.addProduct(new Product("Guitar", 8000));

        ShoppingCartPrinter printer = new ShoppingCartPrinter(cart);
        printer.printInvoice();

        ShoppingCartStorage db = new ShoppingCartStorage(cart);
        db.saveToDB();
    }
}