package com.company;

import java.util.ArrayList;

public class Fight {
    private ArrayList<Start_Droid> firstTeam;
    private ArrayList<Start_Droid> secondTeam;

    public Fight(ArrayList<Start_Droid> first, ArrayList<Start_Droid> second) {
        this.firstTeam = first;
        this.secondTeam = second;
    }

    public boolean firstTeam_DroidLive(){
        for(int i = 0; i < this.firstTeam.size(); i++){
            if (!(this.firstTeam.get(i).Droidlive())){
                this.firstTeam.remove(i);
            }
        }
        if (this.firstTeam.isEmpty()){
            return false;
        }
        else {
            return true;
        }
    }

    public boolean secondTeam_DroidLive(){
        for(int i = 0; i < this.secondTeam.size(); i++){
            if (!(this.secondTeam.get(i).Droidlive())){
                this.secondTeam.remove(i);
            }
        }
        if (this.secondTeam.isEmpty()){
            return false;
        }
        else {
            return true;
        }
    }

    public Start_Droid choseFirstTeamDroid(){
        int firstSize;
        int f;
        firstSize = this.firstTeam.size();
        f = (int) (Math.random() * firstSize);
        if (f >= firstSize){
            f = firstSize - 1;
        }
        return this.firstTeam.get(f);
    }

    public Start_Droid choseSecondTeamDroid(){
        int secondSize;
        int s;
        secondSize =this.secondTeam.size();
        s = (int) (Math.random() * secondSize);
        if (s >= secondSize){
            s = secondSize - 1;
        }
        return this.secondTeam.get(s);
    }

    public void startFight(){
        int i;
        Start_Droid Droid_Shoot;
        Start_Droid Droid_Pain;
        i = (int) (Math.random() + 0.5);
        if (i == 0){
            Droid_Shoot = this.choseFirstTeamDroid();
            Droid_Pain = this.choseSecondTeamDroid();
            Droid_Shoot.Shoot(Droid_Pain);
            System.out.println("\t\t\t" + Droid_Shoot.getKind_droid() +
                    " >-- Peaw -> " + Droid_Pain.getKind_droid());
            Droid_Shoot.Use_Special_Ult_Afonya(Droid_Pain);
            Droid_Pain.Use_Special_Ult_Helper(Droid_Pain);
        }
        else if (i == 1){
            Droid_Pain = this.choseFirstTeamDroid();
            Droid_Shoot = this.choseSecondTeamDroid();
            Droid_Shoot.Shoot(Droid_Pain);
            System.out.println("\t\t\t" + Droid_Shoot.getKind_droid() +
                    " >-- Peaw -> " + Droid_Pain.getKind_droid());
            Droid_Shoot.Use_Special_Ult_Afonya(Droid_Pain);
            Droid_Pain.Use_Special_Ult_Helper(Droid_Pain);
        }

    }


    public void start_fight(){
        int round = 1;

        while (this.firstTeam_DroidLive() | this.secondTeam_DroidLive()){

            System.out.println("\n\t\t\t\t\tРаунд: " + round);
            if (!this.secondTeam_DroidLive()){
                System.out.println("Перша команда виграла:");
                this.printFirstTeam();
                return;
            }
           if (!this.firstTeam_DroidLive()){
                System.out.println("Друга команда виграла:");
                this.printSecondTeam();
                return;
            }
            this.startFight();
            System.out.print("\nПерша команда:\n");
            this.printFirstTeam();
            System.out.println("\nДруга команда:");
            this.printSecondTeam();
            round++;
        }
    }

    public void printFirstTeam(){
        for (Start_Droid droid : this.firstTeam) {
            droid.printDroid();
        }

    }

    public void printSecondTeam() {
        for (Start_Droid droid : this.secondTeam) {
            droid.printDroid();
        }
    }
}
