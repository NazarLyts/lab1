package com.company;

public class StonePriceComparison implements java.util.Comparator<Stone> {

    public int compare(Stone stone1, Stone stone2) {
        return (stone1.getStonePrice() - stone2.getStonePrice());
    }
}