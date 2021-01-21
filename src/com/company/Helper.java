package com.company;

public class Helper extends Start_Droid{
    Helper(){
        super.setKind_droid("Helper");
        super.setHealth(78);
        super.setDamage(10);
    }
    @Override
    public void heal(Start_Droid helper){
        super.heal(helper);
        this.setHealth(this.getHealth() + 6);
    }
}
