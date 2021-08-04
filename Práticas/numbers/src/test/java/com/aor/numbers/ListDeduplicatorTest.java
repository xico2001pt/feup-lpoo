package com.aor.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class ListDeduplicatorTest {
    private List<Integer> list;
    private List<Integer> expected;

    @BeforeEach
    public void helper() {
        this.list = Arrays.asList(1,2,4,2,5);
        this.expected = Arrays.asList(1,2,4,5);
    }

    @Test
    public void deduplicate() {
        ListDeduplicator deduplicator = new ListDeduplicator();
        List<Integer> distinct = deduplicator.deduplicate(list, new ListSorter());

        Assertions.assertEquals(expected, distinct);
    }
}
