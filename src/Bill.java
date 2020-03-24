import java.util.HashMap;
import java.util.Map;

public class Bill {
    private Customer customer;
    private Map<Product,Integer> products = new HashMap<>();
    private Delivery delivery;

    // constructeur de Bill
    public Bill(Customer customer,Delivery delivery) {
        this.customer = customer;
        this.delivery = delivery;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Delivery getDelivery(){
        return delivery;
    }

    public Map<Product, Integer> getProducts() {
        return products;
    }
    //méthode pour ajouter une ligne de commande
    public void addProduct(Product product, int quantity){
        this.products.put(product,quantity);
    }
}






