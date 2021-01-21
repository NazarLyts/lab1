package com.company;

public class Start_Droid {
    int health;
    int damage;
   // int heal;
    int armor;
   // int ult;
    String kind_droid;

    public Start_Droid(){
        this.health = 0;
        this.damage = 0;
        this.armor= 0;
        this.kind_droid = "*_*";
    }

    public int getHealth() {
        return health;
    }
    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }
    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getArmor() {
        return armor;
    }
    public void setArmor(int armor) {
        this.armor = armor;
    }

    public String getKind_droid() {
        return kind_droid;
    }
    public void setKind_droid(String kind_droid) {
        this.kind_droid = kind_droid;
    }

    public boolean Droidlive(){
        return this.getHealth() > 0;
    }

    @Override
    public String toString(){
        return "\nStart_Droid{" +
                "\nhealth=" + health +
                ",\ndamage=" + damage +
                ",\narmor=" + armor +
                ",\nkind_droid=" + kind_droid +
                '}';
    }

    public void last_blood(Start_Droid afonya){
        System.out.printf("\nУльт(з кожною новою атакою добавляється до урону + 2 поінти): Afonya");
    }
    public void Use_Special_Ult_Afonya(Start_Droid afonya){
        this.last_blood(afonya);

    }

    public void heal(Start_Droid helper){
        System.out.printf("\nЛікується на 6 поінтів кожного разу коли на нього нападають: Helper");
    }
    public void Use_Special_Ult_Helper(Start_Droid helper){
        this.heal(helper);
    }


    public void Shoot(Start_Droid pain){
        if (pain.getArmor() != 0){
            pain.setArmor(pain.getArmor() - this.getDamage());
            if (pain.getArmor() < 0){
                pain.setHealth(pain.getHealth() + pain.getArmor());
                pain.setArmor(0);
            }
        }
        else {
            pain.setHealth(pain.getHealth() - this.getDamage());
        }
    }

    public void printDroid(){
        System.out.println("\n{\tKind\t}{\tHealth\t}{\tDamage\t}{\tArmor\t}");
        System.out.printf("{\t%-8s}{\t%d\t\t}{\t%d\t\t}{\t%d\t\t}\n",
                this.getKind_droid(), this.getHealth(), this.getDamage(), this.getArmor());
    }
}
