package com.company.Commands;

import com.company.Control;
import com.company.Necklace;
import java.util.logging.Logger;
import java.util.Scanner;

public class CreateNewNecklace extends Command {
    private final Logger LOGGER = Logger.getLogger(CreateNewNecklace.class.getName());

    public CreateNewNecklace(Control control) {
        this.control = control;

    }

    @Override
    public void execute() {
        Scanner scan = new Scanner(System.in);
        System.out.println("\nPlease enter a necklace name: ");
        String necklaceName = scan.nextLine();
        if (necklaceName == null || necklaceName.equals("")) {
            LOGGER.warning("Unable to create a necklace with the same name !");
            return;
        }
        if (findNecklace(necklaceName) != null)
            LOGGER.warning("This necklace already exists !");

        control.getNecklace().add(new Necklace(necklaceName));
        System.out.println("\nNecklace has been successfully created!");

    }

    private Necklace findNecklace(String NecklaceName) {
        for (Necklace elem : control.getNecklace()) {
            if (elem.getNecklaceName().equalsIgnoreCase(NecklaceName)) return elem;
        }
        return null;
    }
}
