package hu.nive.ujratervezes.oopcollection.army;

public class Swordsman extends MilitaryUnit {
    private boolean firstDamage = true;

    public Swordsman(boolean armor) {
        super(100, 10, armor);
    }

    @Override
    public void sufferDamage(int damage) {
        if(firstDamage) {
            firstDamage = false;
        } else {
            super.sufferDamage(damage);
        }
    }
}