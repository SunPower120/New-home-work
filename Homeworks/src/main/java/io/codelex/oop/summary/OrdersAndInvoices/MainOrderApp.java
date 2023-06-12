package io.codelex.oop.summary.OrdersAndInvoices;

import java.math.BigDecimal;
import java.time.LocalDate;

public class MainOrderApp {
    public static void main(String[] args) {
        FoodItem apple = new FoodItem("Abols", BigDecimal.valueOf(12.5), LocalDate.of(2024, 1, 1));
        FoodItem bumbieris = new FoodItem("Bumbieris", BigDecimal.valueOf(12.5), LocalDate.of(2024, 1, 1));
        ElectronicsItem radio = new ElectronicsItem("Philips", BigDecimal.valueOf(22.35), "15W");
        HouseHoldItem chair = new HouseHoldItem("Kresls", BigDecimal.valueOf(87.77), "green");
        ItemPacking packing = new ItemPacking();

        Order firstOrder = new Order();

        firstOrder.addItemToOrderList(apple);
        firstOrder.addItemToOrderList(bumbieris);
        firstOrder.addItemToOrderList(radio);
        firstOrder.addItemToOrderList(chair);
        firstOrder.addItemToOrderList(packing);

        Invoice firstInvoice = new Invoice(firstOrder, "AA 12444");

        System.out.println(firstInvoice.getFormattedInvoice());

        firstInvoice.send();

        System.out.println(firstInvoice.getFormattedInvoice());
    }
}
