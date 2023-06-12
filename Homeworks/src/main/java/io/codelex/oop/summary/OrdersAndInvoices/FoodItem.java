package io.codelex.oop.summary.OrdersAndInvoices;

import java.math.BigDecimal;
import java.time.LocalDate;

public class FoodItem extends AbstractItem {

    private LocalDate dateOfExpiration;

    public FoodItem(String name, BigDecimal price, LocalDate dateOfExpiration) {
        super(name, price);
        this.dateOfExpiration = dateOfExpiration;
    }

    public LocalDate getDateOfExpiration() {
        return dateOfExpiration;
    }

    public void setDateOfExpiration(LocalDate dateOfExpiration) {
        this.dateOfExpiration = dateOfExpiration;
    }

}
