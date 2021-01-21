package com.company.Commands;

import com.company.*;
import java.util.ArrayList;

public class SortStonesByValue extends Command {
    public SortStonesByValue(Control control) {
        this.control = control;
    }

    @Override
    public void execute() {
        System.out.println("\nSorted stones by value:\n");
        ArrayList<Stone> stones = getAllStones();
        stones.sort(new StonePriceComparison());
        for (Stone stone : stones) System.out.println(stone);

    }

    private ArrayList<Stone> getAllStones() {
        ArrayList<Stone> stones = new ArrayList<>();
        for (Necklace necklace : control.getNecklace()) {
            stones.addAll(necklace.getStoneForNecklace());
        }
        return stones;
    }
}


