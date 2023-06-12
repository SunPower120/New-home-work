package io.codelex.oop.summary.OrdersAndInvoices;

import java.math.BigDecimal;

public class ItemPacking implements Service {

    static final String name = "Item packing";
    static final BigDecimal price = BigDecimal.valueOf(5);

    @Override
    public String getName() {
        return name;
    }

    @Override
    public BigDecimal getPrice() {
        return price;
    }

}
