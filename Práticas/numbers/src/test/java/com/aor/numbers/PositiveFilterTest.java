package com.aor.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PositiveFilterTest {
    @Test
    void accept() {
        PositiveFilter positiveFilter = new PositiveFilter();

        Assertions.assertEquals(false, positiveFilter.accept(0));
    }
}