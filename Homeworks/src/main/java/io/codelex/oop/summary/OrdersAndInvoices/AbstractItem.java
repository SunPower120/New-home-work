package io.codelex.oop.summary.OrdersAndInvoices;

import java.math.BigDecimal;

public abstract class AbstractItem implements Item {
    private String name;
    private BigDecimal price;

    public AbstractItem(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

}
