package io.codelex.oop.summary.OrdersAndInvoices;

import java.math.BigDecimal;

public class ElectronicsItem extends AbstractItem {

    private String power;

    public ElectronicsItem(String name, BigDecimal price, String power) {
        super(name, price);
        this.power = power;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

}
