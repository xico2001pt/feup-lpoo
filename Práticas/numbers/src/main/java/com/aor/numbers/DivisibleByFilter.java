package com.aor.numbers;

public class DivisibleByFilter implements GenericListFilter {
    private Integer number;
    public DivisibleByFilter(Integer number) {
        this.number = number;
    }

    @Override
    public boolean accept(Integer number) {
        if (this.number == 0 || number <= 0) return false;

        return number % this.number == 0;
    }
}
