public class Main {
    public static void main(String[] args) {
        Television television =new Television( "tv samsung", "tv samsung led", 820,80,"hd");
        Fridge fridge =new Fridge( "fridge wirpool", "fridge avec congelo et ventilé", 220,120,true);
        Product cafiere= new Product("cafière","nespresso",10);
        Customer customer=new Customer("dupond", "2 rue de la gare 75001 Paris");
        Delivery relaisDelivery = new RelayDelivery(45);
        Bill bill=new Bill(customer,relaisDelivery);
        bill.addProduct(television,1);
        bill.addProduct(fridge,1);
        bill.addProduct(cafiere,1);

        television.look();
        fridge.look();
        cafiere.look();
        Product television2 =new Television( "tv samsung2", "tv samsung led", 820,80,"hd");
        television2.look();
        System.out.println("test");
    }
}
