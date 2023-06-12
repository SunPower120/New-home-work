package io.codelex.oop.summary.OrdersAndInvoices;

public class WrongOrderException extends RuntimeException {
    public WrongOrderException(String message) {
        super(message);
    }
}
