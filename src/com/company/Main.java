package com.company;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int firstnumber;
        int secondnumber;
        ArrayList<Start_Droid> firstTeam = new ArrayList<>();
        ArrayList<Start_Droid> secondTeam = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        System.out.println("Кількість дроїдів у першій команді:");
        firstnumber = in.nextInt();
        for(int i = 0;i < firstnumber;i++){
            System.out.print("Тип дроїда:\n" +
                    "1 - Afonya\n" +
                    "2 - R2D2\n" +
                    "3 - Helper\n");
            int droid_type = in.nextInt();
            if(droid_type == 1) {
                firstTeam.add(new Afonya());
            }
            else if(droid_type == 2) {
                firstTeam.add(new R2D2());
            }
            else if(droid_type == 3) {
                firstTeam.add(new Helper());
            }else{
                System.out.println("Ви вибрали дроїда якого немає");
            }

        }
        System.out.println("Кількість дроїдів у другій команді:");
        secondnumber = in.nextInt();
        for(int i = 0;i < secondnumber;i++){
            System.out.print("Тип дроїда:\n" +
                    "1 - Afonya\n" +
                    "2 - R2D2\n" +
                    "3 - Helper\n");
            int droid_type = in.nextInt();
            if(droid_type == 1) {
                secondTeam.add(new Afonya());
            }
            else if(droid_type == 2) {
                secondTeam.add(new R2D2());
            }
            else if(droid_type == 3) {
                secondTeam.add(new Helper());
            }else{
                System.out.println("Ви вибрали дроїда якого немає");
            }

        }
        Fight fight = new Fight(firstTeam, secondTeam);
        fight.printFirstTeam();
        fight.printSecondTeam();
        fight.start_fight();
    }
}
