package tests;

import entities.Order;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OrderTest extends CartCycleTest {
    @Override
    @Test
    public void test() {
        createCartRecord();
        Order expectedOrder = new Order(
                "Куртка NICOLO TONETTO черный",
                "Anabelle Fashion Hub",
                "1",
                "67 500 ₽"
        );

        Order resultOrder = app.getCartHelper().getLastCreatedOrder();

        Assertions.assertEquals(expectedOrder.getNumber(), resultOrder.getNumber());

        app.getCartHelper().removeProductFromCart();

        app.getAuthHelper().logout();
    }
}
