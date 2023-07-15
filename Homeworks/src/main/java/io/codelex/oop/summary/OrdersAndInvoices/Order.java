package io.codelex.oop.summary.OrdersAndInvoices;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private final List<SellableThings> orderList = new ArrayList<>();


    public List<SellableThings> getOrderList() {
        return orderList;
    }

    public void addItemToOrderList(SellableThings item) {
        if (item instanceof FoodItem) {
            checkDate((FoodItem) item);
        }
        orderList.add(item);
    }

    public void checkDate(FoodItem foodItem) {
        if ((foodItem.getDateOfExpiration().isBefore(LocalDate.now()))) {
            throw new BadFoodException("Food is due Expiration date");
        }
    }

    public List<String> getListOfItems() {
        List<String> itemNames = new ArrayList<>();
        for (SellableThings item : orderList) {
            itemNames.add(item.getName());
        }
        return itemNames;
    }
}
