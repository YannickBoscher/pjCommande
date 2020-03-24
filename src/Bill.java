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

    public void generate(Writer1 write) {
        write.start();
        write.writeLine("HomeShop compagnie");
        write.writeLine("1 Place Charles de Gaulle, 75008 Paris");
        write.writeLine("");
        write.writeLine("Facture à l'attention de : ");
        write.writeLine(customer.getName());
        write.writeLine(customer.getAdress());
        write.writeLine("");
        write.writeLine("Mode de livraison : " + delivery.getInfo());
        write.writeLine("");
        write.writeLine("Produits : ");
        write.writeLine("-----------------------------------------------------");


        for (Map.Entry<Product, Integer> entry : products.entrySet()) {
            Product products = entry.getKey();
            Integer quantite = entry.getValue();
            write.writeLine(products.getName() + " " + quantite + " " + products.getPrice() + " " + products.getPrice()*quantite);
        }

        write.writeLine("-----------------------------------------------------");
        write.writeLine( " Cout de la livraison " + delivery.getPrice());
        write.writeLine("-----------------------------------------------------");
        write.writeLine( " le montant total de la commande est de " + this.getTotal());
        write.writeLine("-----------------------------------------------------");
        write.stop();

    }

    public double getTotal() {
        double totalPrice = 0;
        for(Map.Entry<Product, Integer> entry : products.entrySet()){
            Product product=entry.getKey();
            Integer quantity = entry.getValue();
            totalPrice += product.getPrice() * quantity;
        }


        return totalPrice;
    }
}






