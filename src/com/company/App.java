package com.company;

import com.company.Commands.*;
import java.util.Scanner;
import java.io.IOException;
import java.util.logging.*;

public class App {

    private static final Control control = new Control();

    private static final Develop develop = new Develop(
            new CreateNewNecklace(control),
            new CreateNewStone(control),
            new ListOfStones(control),
            new OverallWeightInCarats(control),
            new OverallValueInPrice(control),
            new SortStonesByValue(control),
            new SortStonesByWeight(control),
            new TransparencyRange(control)
    );

    public static class MyFilter implements Filter {

        @Override
        public boolean isLoggable(LogRecord record) {
            return record.getMessage().endsWith("IN_FILE");

        }
    }

    static int select;
    static Scanner scanner = new Scanner(System.in);
    static Logger LOGGER = Logger.getLogger(App.class.getName());

    public void Work() throws IOException {
        Handler fileHandler = new LoggerFile().GetFile();
        fileHandler.setFilter(new MyFilter());
        LOGGER.addHandler(fileHandler);

        while (true) {
            printMenu();
            menuCommands();
        }
    }

    private static void printMenu() {
        System.out.println(
                "\n1. CreateNewNecklace" +
                        "\n2. CreateNewStone" +
                        "\n3. ListOfStones" +
                        "\n4. OverallWeightInCarats" +
                        "\n5. OverallValueInPrice" +
                        "\n6. SortStonesByValue" +
                        "\n7. SortStonesByWeight" +
                        "\n8. TransparencyRange" +
                        "\n9. Exit\n" +
                        "\nSelect Command:");
    }

    private static void menuCommands() {

        select = scanner.nextInt();
        if (select <= 0 || select > 9) {
            LOGGER.warning("The value cannot be less than 0 or greater than 9");
            LOGGER.setUseParentHandlers(false);
            LOGGER.info("An error occurred while selecting the menu item IN_FILE");
            LOGGER.setUseParentHandlers(true);

        }
        switch (select) {
            case 1 -> develop.CreateNewNecklace();
            case 2 -> develop.CreateNewStone();
            case 3 -> develop.ListOfStones();
            case 4 -> develop.OverallWeightInCarats();
            case 5 -> develop.OverallValueInPrice();
            case 6 -> develop.SortStonesByValue();
            case 7 -> develop.SortStonesByWeight();
            case 8 -> develop.TransparencyRange();
            case 9 -> System.exit(0);
        }

    }
}
