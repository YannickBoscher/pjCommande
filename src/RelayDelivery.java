public class RelayDelivery implements Delivery {
    int number;
    public RelayDelivery(int number){
        this.number=number;
    }

    @Override
    public double getPrice() {
        if (number > 0 && number <= 22){
            return 0;
        }
        else {
            if (number > 23 && number <= 43){
                return 4.99;
            }
            else {
                return 6.99;
            }
        }

    }

    @Override
    public String getInfo() {
        return "Relay delivery";
    }
}
