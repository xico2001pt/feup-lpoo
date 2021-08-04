package com.aor.numbers;

import java.util.ArrayList;
import java.util.List;

public class ListFilterer {
    private GenericListFilter filter;

    public ListFilterer(GenericListFilter filter) {
        this.filter = filter;
    }

    public List<Integer> filter(List<Integer> list) {
        List<Integer> result = new ArrayList<>();
        for (Integer integer : list) {
            if (filter.accept(integer))
                result.add(integer);
        }
        return result;
    }
}
