import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RelayDeliveryTest {
    @Test
    public void get_shouldReturnPrice_RelayDelivery1_22(){
        Delivery delivery = new RelayDelivery(5);
        assertEquals(0.0, delivery.getPrice(), 0.01);
    }
    @Test
    public void get_shouldReturnPrice_RelayDelivery23_47(){
        Delivery delivery = new RelayDelivery(44);
        assertEquals(4.99, delivery.getPrice(), 0.01);
    }
    @Test
    public void get_shouldReturnPrice_RelayDelivery48_more(){
        Delivery delivery = new RelayDelivery(48);
        assertEquals(6.99, delivery.getPrice(), 0.01);
    }

}