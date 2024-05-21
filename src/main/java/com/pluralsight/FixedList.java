package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class FixedList <T> {
    private List<T> items;
    private int maxSize;
    public FixedList(int maxSize) {
        this.maxSize = maxSize;
    }
    public void add(T item) {
        items = new ArrayList<>(maxSize);
        if (maxSize >= items.size()) {
            items.add(item);
        }
    }
    public List<T> getItems() {
        return items;
    }

}
