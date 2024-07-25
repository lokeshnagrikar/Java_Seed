package com.seed.library.utility;

import java.util.ArrayList;
import java.util.List;

public class StoreUtil<T> {
    private List<T> records = new ArrayList<>();

    public void addRecord(T record) {
        records.add(record);
    }


    //arraylist method
    public List<T> getRecords() {
        return records;
    }

    public int getNoOfRecords() {
        return records.size();
    }
}