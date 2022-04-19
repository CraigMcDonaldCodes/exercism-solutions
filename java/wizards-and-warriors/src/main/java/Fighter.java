abstract class Fighter {

    abstract boolean isVulnerable();
    abstract int damagePoints(Fighter fighter);

    @Override
    public String toString() {
        return "Fighter is a " + this.getClass().getSimpleName();
    }

}

class Warrior extends Fighter {

    private static final int MIN_DAMAGE = 6;
    private static final int MAX_DAMAGE = 10;

    private boolean vulnerable = false;

    @Override
    public boolean isVulnerable() {
        return vulnerable;
    }

    @Override
    int damagePoints(Fighter wizard) {

        if (wizard.isVulnerable()) {
            return MAX_DAMAGE;
        } else {
            return MIN_DAMAGE;
        }
    }
}

class Wizard extends Fighter {

    private static final int MIN_DAMAGE = 3;
    private static final int MAX_DAMAGE = 12;

    private boolean spellPrepared = false;

    @Override
    boolean isVulnerable() {
        return !spellPrepared;
    }

    @Override
    int damagePoints(Fighter warrior) {

        if (spellPrepared) {
            return MAX_DAMAGE;
        } else {
            return MIN_DAMAGE;
        }
    }

    void prepareSpell() {
        spellPrepared = true;
    }
}
