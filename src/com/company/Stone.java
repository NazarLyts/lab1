package com.company;

import java.util.Objects;

public class Stone {

    private Necklace necklace;

    private static int stoneIdCounter = 1;

    private final String stoneName;

    private final int stoneId;

    private final int stoneWeight;

    private final int stonePrice;

    private final int stoneTransparency;

    public Stone(String stoneName, int stoneId, int stoneWeight, int stonePrice, int stoneTransparency) {
        stoneId = stoneIdCounter++;
        this.stoneName = stoneName;
        this.stoneId = stoneId;
        this.stoneWeight = stoneWeight;
        this.stonePrice = stonePrice;
        this.stoneTransparency = stoneTransparency;

    }

    public String getStoneName() {
        return stoneName;
    }

    public int getStoneId() {
        return stoneId;
    }

    public int getStoneWeight() {
        return stoneWeight;
    }

    public int getStonePrice() {
        return stonePrice;
    }

    public int getStoneTransparency() {
        return stoneTransparency;
    }

    public void RemoveStoneFromNecklace() {
        necklace = null;
    }

    @Override
    public String toString() {
        return "Stone{" +
                "stoneName = " + stoneName +
                ", stoneId = " + stoneId +
                ", stoneWeight = " + stoneWeight + " Carats" +
                ", stonePrice = " + stonePrice + " $" +
                ", stoneTransparency = " + stoneTransparency +
                "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Stone stone = (Stone) obj;
        if (stoneId != stone.stoneId) return false;
        if (stoneWeight != stone.stoneWeight) return false;
        if (!stoneName.equals(stone.stoneName)) return false;
        return Objects.equals(necklace, stone.necklace);
    }
}
