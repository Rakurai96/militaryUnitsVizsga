package hu.nive.ujratervezes.oopcollection.army;

import java.util.ArrayList;
import java.util.List;

public class Army {
    private List<MilitaryUnit> militaryUnits = new ArrayList<>();

    public void addUnit(MilitaryUnit militaryUnit) {
        this.militaryUnits.add(militaryUnit);
    }

    public void damageAll(int damage) {
        List<MilitaryUnit> fallenUnits = new ArrayList<>();

        for (int i = 0; i < militaryUnits.size(); i++) {
            MilitaryUnit militaryUnit = militaryUnits.get(i);
            militaryUnit.sufferDamage(damage);

            if(militaryUnit.getHitPoints() < 25) {
                fallenUnits.add(militaryUnit);
            }
        }

        militaryUnits.removeAll(fallenUnits);
    }

    public int getArmyDamage() {
        int sumOfArmyDamage = 0;
        for (int i = 0; i < militaryUnits.size(); i++) {
            MilitaryUnit militaryUnit = militaryUnits.get(i);
            sumOfArmyDamage += militaryUnit.doDamage();
        }

        return sumOfArmyDamage;
    }

    public int getArmySize() {
        return militaryUnits.size();
    }
}