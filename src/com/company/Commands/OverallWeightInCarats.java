package com.company.Commands;

import com.company.Stone;
import com.company.Necklace;
import com.company.Control;
import java.util.ArrayList;

public class OverallWeightInCarats extends Command {
    public OverallWeightInCarats(Control control) {
        this.control = control;
    }

    @Override
    public void execute() {
        int totalWeight = 0;
        ArrayList<Stone> stones = getAllStones();
        for (Stone stone : stones) {
            totalWeight = totalWeight + stone.getStoneWeight();
        }
        System.out.println("\nOverall weight of all stones: " + totalWeight + " Carats");
    }

    private ArrayList<Stone> getAllStones() {
        ArrayList<Stone> stones = new ArrayList<>();
        for (Necklace necklace : control.getNecklace()) {
            stones.addAll(necklace.getStoneForNecklace());
        }
        return stones;
    }
}
