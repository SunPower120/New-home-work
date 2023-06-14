package io.codelex.Test_14_06_23.SecondExercise;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BasketTest {

    @Test
    public void shouldStoreItemsAndThrowExceptionWhenFull() {
        Basket<Apple> appleBasket = new Basket<>();
        for (int i = 0; i < 10; i++) {
            appleBasket.addToBasket(new Apple());
        }
        Assertions.assertEquals(10, appleBasket.getItemCount());
        Assertions.assertThrows(BasketFullException.class, () -> appleBasket.addToBasket(new Apple()));

        Basket<Mushroom> mushroomBasket = new Basket<>();
        for (int i = 0; i < 10; i++) {
            mushroomBasket.addToBasket(new Mushroom());
        }
        Assertions.assertEquals(10, mushroomBasket.getItemCount());
        Assertions.assertThrows(BasketFullException.class, () -> mushroomBasket.addToBasket(new Mushroom()));
    }

    @Test
    public void shouldRemoveItemsAndThrowExceptionWhenEmpty() {
        Basket<Apple> appleBasket = new Basket<>();
        appleBasket.addToBasket(new Apple());
        appleBasket.removeFromBasket();
        Assertions.assertEquals(0, appleBasket.getItemCount());
        Assertions.assertThrows(BasketEmptyException.class, appleBasket::removeFromBasket);

        Basket<Mushroom> mushroomBasket = new Basket<>();
        mushroomBasket.addToBasket(new Mushroom());
        mushroomBasket.removeFromBasket();
        Assertions.assertEquals(0, mushroomBasket.getItemCount());
        Assertions.assertThrows(BasketEmptyException.class, mushroomBasket::removeFromBasket);
    }
}