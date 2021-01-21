package com.company.Commands;

import com.company.Control;
import com.company.Necklace;
import com.company.Stone;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Logger;

public class TransparencyRange extends Command {
    private final Logger LOGGER = Logger.getLogger(TransparencyRange.class.getName());

    public TransparencyRange(Control control) {
        this.control = control;
    }

    @Override
    public void execute() {
        ArrayList<Stone> stones = getAllStones();


        int lowerBoundary = inputLower();
        if (lowerBoundary < 1) {
            LOGGER.warning("Lower boundary has to be a positive value...");
            return;
        }
        int upperBoundary = inputUpper();
        if (lowerBoundary >= upperBoundary) {
            LOGGER.warning("Lower boundary has to be smaller than upper boundary");
            return;
        }

        for (Stone stone : stones) {
            if (stone.getStoneTransparency() > lowerBoundary && stone.getStoneTransparency() < upperBoundary) {
                System.out.println("\nStones in given transparency range:\n");
                getAllStones();
                System.out.println(stone);
            } else {
                System.out.println("\nUnable to find stones in this transparency range...");
            }
        }
    }

    private ArrayList<Stone> getAllStones() {
        ArrayList<Stone> stones = new ArrayList<>();
        for (Necklace necklace : control.getNecklace()) {
            stones.addAll(necklace.getStoneForNecklace());
        }
        return stones;
    }

    private static int inputLower() {
        Scanner scan = new Scanner(System.in);
        System.out.println("\n Please enter the lower transparency boundary:");
        return scan.nextInt();
    }

    private static int inputUpper() {
        Scanner scan = new Scanner(System.in);
        System.out.println("\n Please enter the upper transparency boundary:");
        return scan.nextInt();
    }
}
