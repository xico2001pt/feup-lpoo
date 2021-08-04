package com.aor.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ListFiltererTest {
    private List<Integer> list;

    @BeforeEach
    void helper() {
        this.list = Arrays.asList(-2,0,1,2,4,5);
    }
    @Test
    void filter() {
        Integer number = 2;
        ListFilterer filterer = new ListFilterer(new DivisibleByFilter(number));
        List<Integer> expected = Arrays.asList(2,4);

        List<Integer> result = filterer.filter(this.list);

        Assertions.assertEquals(expected, result);
    }
}