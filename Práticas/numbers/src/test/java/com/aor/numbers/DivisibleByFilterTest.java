package com.aor.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DivisibleByFilterTest {
    @Test
    void accept() {
        Integer number = 2;

        DivisibleByFilter divisible = new DivisibleByFilter(number);

        Assertions.assertEquals(true, divisible.accept(4));
    }
}