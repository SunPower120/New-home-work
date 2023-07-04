package io.codelex.Test_14_06_23.SecondExercise;

import java.util.ArrayList;
import java.util.List;

public class Basket<T> {
    private final List<T> items;
    private static final int MAX_ITEMS = 10;

    public Basket() {
        this.items = new ArrayList<>();
    }

    public void addToBasket(T item) {
        if (items.size() == MAX_ITEMS) {
            throw new BasketFullException("Basket is full");
        }
        items.add(item);
    }

    public void removeFromBasket() {
        if (items.isEmpty()) {
            throw new BasketEmptyException("Basket is empty");
        }
        items.remove(items.size() - 1);
    }

    public int getItemCount() {
        return items.size();
    }
}

