import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class deliveryExpressTest {

    @Test
    void getPrice_parisCityDeliveryExpress_4d99() {
        Delivery delivery =new deliveryExpress("Paris");
        assertEquals(4.99,delivery.getPrice(),0.01);
        }

    @Test
    void getPrice_otherCountryCityDeliveryExpress_6d99() {
        Delivery delivery =new deliveryExpress("Bordeaux");
        assertEquals(6.99,delivery.getPrice(),0.01);
    }
}
