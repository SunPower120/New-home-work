package io.codelex.oop.summary.OrdersAndInvoices;

import java.math.BigDecimal;

public class HouseHoldItem extends AbstractItem {

    private String color;

    public HouseHoldItem(String name, BigDecimal price, String color) {
        super(name, price);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
