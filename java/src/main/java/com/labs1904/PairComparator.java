package com.labs1904;

import java.util.Comparator;

public class PairComparator implements Comparator<String> {
    public int compare(String x, String y){
        String pair1 = y + x;
        String pair2 = x + y;
        return pair1.compareTo(pair2);
    }
}
