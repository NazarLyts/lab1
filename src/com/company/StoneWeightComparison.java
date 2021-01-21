package com.company;

public class StoneWeightComparison implements java.util.Comparator<Stone> {

    public int compare(Stone stone1, Stone stone2) {
        return (stone1.getStoneWeight() - stone2.getStoneWeight());
    }
}