package com.aor.refactoring.example1;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<OrderLine> lines;

    public Order() {
        lines = new ArrayList<>();
    }

    public void add(OrderLine orderLine) {
        lines.add(orderLine);
    }

    public boolean isEligibleForFreeDelivery() {
        return totalPrice() > 100;
    }

    public String printOrder() {
        StringBuffer printBuffer = new StringBuffer();

        for (OrderLine line : lines)
            printBuffer.append(line.getProduct().getName() + "(x" + line.getQuantity() + "): " + (line.getProduct().getPrice() * line.getQuantity()) + "\n");

        printBuffer.append("Total: " + totalPrice());

        return printBuffer.toString();
    }

    public double totalPrice() {
        double total = 0;
        for (OrderLine line : lines)
            total += line.getProduct().getPrice() * line.getQuantity();
        return total;
    }
}