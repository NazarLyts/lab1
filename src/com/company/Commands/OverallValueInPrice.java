package com.company.Commands;

import com.company.Stone;
import com.company.Necklace;
import com.company.Control;
import java.util.ArrayList;

public class OverallValueInPrice extends Command {

    public OverallValueInPrice(Control control) {
        this.control = control;
    }

    @Override
    public void execute() {
        int totalPrice = 0;
        ArrayList<Stone> stones = getAllStones();
        for (Stone stone : stones) {
            totalPrice = totalPrice + stone.getStonePrice();
        }
        System.out.println("\nOverall value of all stones: " + totalPrice + " $");
    }

    private ArrayList<Stone> getAllStones() {
        ArrayList<Stone> stones = new ArrayList<>();
        for (Necklace necklace : control.getNecklace()) {
            stones.addAll(necklace.getStoneForNecklace());
        }
        return stones;
    }
}
