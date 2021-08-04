package com.aor.numbers;

import java.util.List;

public interface GenericListDeduplicator {
    /**
     * Removes duplicate numbers from a list.
     * @return A list having the same numbers as the original
     * but withou duplicates. The order of the numbers might
     * change.
     */
    public List<Integer> deduplicate(List<Integer> list, GenericListSorter listSorter);
}
