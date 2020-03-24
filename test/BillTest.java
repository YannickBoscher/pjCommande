import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BillTest {
    private String output;
    private Writer1 writerMock=new Writer1() {
        @Override
        public void start() {
            output= "";
        }

        @Override
        public void writeLine(String line) {
            output += line + "\n";
        }

        @Override
        public void stop() {

        }
    };

    private Television television =new Television( "tv samsung", "tv samsung led", 820,80,"hd");
    private Fridge fridge =new Fridge( "fridge wirpool", "fridge avec congelo et ventilé", 220,120,true);
    private Product cafiere= new Product("cafière","nespresso",10.10);
    private Customer customer=new Customer("dupond", "2 rue de la gare 75001 Paris");
    private Delivery relayDelivery = new RelayDelivery(41);

    @Test
    public void Given_2productsAndDelivery_When_generatingBill_Then_getGoodLineNumber() {
        Bill bill = new Bill(customer, relayDelivery);
        bill.addProduct(cafiere, 1);
        bill.addProduct(television, 1);
        bill.addProduct(fridge,2);
        bill.generate(writerMock);
        int lineNumber = output.split("\n").length;
        assertEquals(19, lineNumber);
    }

    @Test
    public void Given_3productsAndDelivery_When_generatingBill_Then_getGoodTotal() {
        Bill bill = new Bill(customer, relayDelivery);
        bill.addProduct(cafiere, 1);
        bill.addProduct(television, 1);
        bill.addProduct(fridge, 1);
        assertEquals(1050.10, bill.getTotal(), 0.01);
    }


}