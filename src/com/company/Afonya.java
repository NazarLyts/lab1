package com.company;

public class Afonya extends Start_Droid {
    Afonya () {
        super.setKind_droid("Afonya ");
        super.setHealth(90);
        super.setDamage(12);
        super.setArmor(10);
    }

    @Override
    public void last_blood(Start_Droid afonya){
        super.last_blood(afonya);
        this.setDamage(this.getDamage() + 2);
    }

}
