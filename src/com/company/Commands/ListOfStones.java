package com.company.Commands;

import com.company.Control;
import com.company.Stone;
import com.company.Necklace;
import java.util.ArrayList;

public class ListOfStones extends Command {
    public ListOfStones(Control control) {
        this.control = control;
    }

    @Override
    public void execute() {
        System.out.println("\nList of all stones:");
        for (Stone stone : getAllStones()) System.out.println(stone);
    }

    private ArrayList<Stone> getAllStones() {
        ArrayList<Stone> stones = new ArrayList<>();
        for (Necklace necklace : control.getNecklace()) {
            stones.addAll(necklace.getStoneForNecklace());
        }
        return stones;
    }
}
