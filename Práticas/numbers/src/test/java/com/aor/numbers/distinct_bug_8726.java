package com.aor.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class distinct_bug_8726 {
    private List<Integer> list;
    GenericListSorter listSorterStub;
    GenericListDeduplicator deduplicatorStub;

    @BeforeEach
    public void helper() {
        this.list = Arrays.asList(1,2,4,2);

        listSorterStub = Mockito.mock(GenericListSorter.class);
        Mockito.when(listSorterStub.sort(Mockito.anyList())).thenReturn(Arrays.asList(1,2,4));

        deduplicatorStub = Mockito.mock(GenericListDeduplicator.class);
        Mockito.when(deduplicatorStub.deduplicate(Mockito.anyList(), Mockito.any())).thenReturn(Arrays.asList(1,2,4));
    }

    @Test
    void distinct() {
        ListAggregator aggregator = new ListAggregator();

        int distinct = aggregator.distinct(list, deduplicatorStub);
        Assertions.assertEquals(3, distinct);
    }

    @Test
    void sort() {
        ListSorter sorter = new ListSorter();
        List<Integer> sorted = sorter.sort(list);
        List<Integer> expected = Arrays.asList(1,2,2,4);

        Assertions.assertEquals(expected, sorted);
    }

    @Test
    void deduplicator() {
        ListDeduplicator deduplicator = new ListDeduplicator();
        List<Integer> expected = Arrays.asList(1,2,4);

        List<Integer> distinct = deduplicator.deduplicate(list, listSorterStub);

        Assertions.assertEquals(expected, distinct);
    }
}