package io.codelex.oop.summary.OrdersAndInvoices;


import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

public class Invoice {
    private final List<SellableThings> items;
    private final String invoiceNumber;
    private InvoiceStatus status;
    private final BigDecimal priceWithoutVAT;
    private final BigDecimal priceWithVAT;

    public Invoice(Order order, String invoiceNumber) {
        if (order.getOrderList().isEmpty()) {
            throw new WrongOrderException("Cannot create an invoice from an empty order.");
        }

        this.invoiceNumber = invoiceNumber;
        this.status = InvoiceStatus.APPROVED;
        this.items = order.getOrderList();
        this.priceWithoutVAT = calculateSum();
        this.priceWithVAT = calculateSumWithVAT();
    }

    private BigDecimal calculateSum() {
        return items.stream()
                .map(SellableThings::getPrice)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    private BigDecimal calculateSumWithVAT() {
        return calculateSum().multiply(new BigDecimal("1.21")).setScale(2, RoundingMode.HALF_UP);
    }

    public void send() {
        this.status = InvoiceStatus.SENT;
    }

    public String getFormattedInvoice() {
        StringBuilder invoice = new StringBuilder();
        List<String> lines = new ArrayList<>();
        int maxLength = 0;

        lines.add("INVOICE NUMBER: " + invoiceNumber);
        maxLength = Math.max(maxLength, lines.get(0).length());

        lines.add("STATUS: " + status);
        maxLength = Math.max(maxLength, lines.get(lines.size() - 1).length());

        for (int i = 0; i < items.size(); i++) {
            SellableThings item = items.get(i);
            lines.add((i + 1) + ". " + item.getName() + ", " + item.getPrice() + " EUR");
            maxLength = Math.max(maxLength, lines.get(lines.size() - 1).length());
        }

        lines.add("SUM: " + priceWithoutVAT + " EUR");
        maxLength = Math.max(maxLength, lines.get(lines.size() - 1).length());

        lines.add("VAT (21%): " + priceWithVAT.subtract(priceWithoutVAT) + " EUR");
        maxLength = Math.max(maxLength, lines.get(lines.size() - 1).length());

        lines.add("TOTAL: " + priceWithVAT + " EUR");
        maxLength = Math.max(maxLength, lines.get(lines.size() - 1).length());

        String frame = "=".repeat(maxLength + 4);
        invoice.append(frame).append("\n");

        for (String line : lines) {
            invoice.append("= ").append(line);
            invoice.append(" ".repeat(Math.max(0, maxLength - line.length())));
            invoice.append(" =\n");
        }

        invoice.append(frame);

        return invoice.toString();
    }
}
