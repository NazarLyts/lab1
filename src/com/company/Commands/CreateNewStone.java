package com.company.Commands;

import com.company.Control;
import com.company.Stone;
import com.company.Necklace;
import java.util.logging.Logger;
import java.util.Scanner;

public class CreateNewStone extends Command {
    private final Logger LOGGER = Logger.getLogger(CreateNewStone.class.getName());

    public CreateNewStone(Control control) {
        this.control = control;
    }

    @Override
    public void execute() {

        String stoneName = inputString("Please enter a stone name:");
        if (stoneName == null || stoneName.equals("")) {
            LOGGER.warning("Necklace name could not be an empty row !");
            return;
        }
        int stoneId = inputId();
        if (stoneId <= 0) {
            LOGGER.warning("Stone ID has to be in range of 1 to 100!");
            return;
        }
        int stoneWeight = inputWeight();
        if (stoneWeight <= 0) {
            LOGGER.warning("Weight of the stone has to be a positive value !");
            return;
        }
        int stonePrice = inputPrice();
        if (stonePrice <= 0) {
            LOGGER.warning("Price has to be a positive value !");
            return;
        }
        int stoneTransparency = inputTransparency();
        if (stoneTransparency > 10) {
            LOGGER.warning("Transparency could only have 10 levels !");
            return;
        }
        String necklaceName = inputString("Enter to which necklace this stone belongs: ");
        Necklace tempNecklace = findNecklace(necklaceName);
        if (tempNecklace == null) {
            LOGGER.warning("\nUnable to find this Necklace...");
            return;
        }
        Stone tempStone = new Stone(stoneName, stoneId, stoneWeight, stonePrice, stoneTransparency);
        tempNecklace.addStoneToNecklace(tempStone);
        System.out.println("\nStone has been successfully created! ");
    }

    private Necklace findNecklace(String necklaceName) {
        for (Necklace elem : control.getNecklace()) {
            if (elem.getNecklaceName().equalsIgnoreCase(necklaceName)) return elem;
        }
        return null;
    }

    private static int inputId() {
        Scanner scan = new Scanner(System.in);
        System.out.println("\nPlease enter stone Id:");
        return scan.nextInt();
    }

    private static int inputWeight() {
        Scanner scan = new Scanner(System.in);
        System.out.println("\nPlease enter stone weight in carats:");
        return scan.nextInt();
    }

    private static int inputPrice() {
        Scanner scan = new Scanner(System.in);
        System.out.println("\nPlease enter stone price($):");
        return scan.nextInt();
    }

    private static int inputTransparency() {
        Scanner scan = new Scanner(System.in);
        System.out.println("\nPlease enter stone transparency:");
        return scan.nextInt();
    }

    private static String inputString(String str) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\n" + str);
        return scan.nextLine();
    }
}
