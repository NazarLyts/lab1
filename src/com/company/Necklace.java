package com.company;

import java.util.ArrayList;

public class Necklace {
    private final String NecklaceName;

    private final ArrayList<Stone> stonesForNecklace;

    public Necklace(String NecklaceName) {
        if (NecklaceName == null || NecklaceName.equals(""))
            throw new IllegalArgumentException("Unable to Create a Necklace with the same name!");
        this.NecklaceName = NecklaceName;
        this.stonesForNecklace = new ArrayList<>();
    }

    public void addStoneToNecklace(Stone stone) {
        if (stone == null) throw new IllegalArgumentException("Unable to add an empty stone !");
        if (!checkStoneExists(stone)) stonesForNecklace.add(stone);
    }

    public void deleteStone(Stone stone) {
        if (stone == null) throw new IllegalArgumentException("Unable to delete a missing stone!");
        if (checkStoneExists(stone)) stonesForNecklace.remove(stone);
    }

    public String getNecklaceName() {
        return NecklaceName;
    }

    public ArrayList<Stone> getStoneForNecklace() {
        return stonesForNecklace;
    }

    private boolean checkStoneExists(Stone stone) {
        for (Stone st : stonesForNecklace) {
            if (st.equals(stone)) return true;
        }
        return false;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Necklace necklace = (Necklace) obj;

        return NecklaceName.equalsIgnoreCase(necklace.NecklaceName);
    }

    @Override
    public String toString() {
        return NecklaceName;
    }
}
