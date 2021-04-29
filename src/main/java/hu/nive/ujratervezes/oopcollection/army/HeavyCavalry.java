package hu.nive.ujratervezes.oopcollection.army;

public class HeavyCavalry extends MilitaryUnit {
    private boolean firstDamage = true;

    public HeavyCavalry() {
        super(150, 20, true);
    }

    @Override
    public int doDamage() {
        int damage = super.doDamage();

        if(firstDamage) {
            firstDamage = false;
            damage *= 3;
        }

        return damage;
    }
}