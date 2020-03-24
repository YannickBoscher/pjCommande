public class deliveryExpress implements Delivery {
    String city;
    public deliveryExpress(String city){
        this.city=city;
    }
    @Override
    public double getPrice() {
        if (city=="Paris"){
            return 4.99;
        }
        else {
            return 6.99;
        }
    }
}
