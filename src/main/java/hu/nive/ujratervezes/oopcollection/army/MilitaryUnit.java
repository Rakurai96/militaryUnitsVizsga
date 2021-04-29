package hu.nive.ujratervezes.oopcollection.army;

public abstract class MilitaryUnit {
    private final int damage;
    private final boolean armor;
    private int health;

    protected MilitaryUnit(int health, int damage, boolean armor) {
        this.health = health;
        this.damage = damage;
        this.armor = armor;
    }

    public int doDamage() {
        return damage;
    }

    public void sufferDamage(int damage) {
        if(armor) {
            this.health -= damage / 2;
        } else {
            this.health -= damage;
        }
    }

    public int getHitPoints() {
        return health;
    }
}
