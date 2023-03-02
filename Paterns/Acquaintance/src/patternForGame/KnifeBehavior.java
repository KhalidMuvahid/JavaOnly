package patternForGame;

interface WeaponBehavior {
    void useWeapon();
}

public class KnifeBehavior implements WeaponBehavior{

    @Override
    public void useWeapon() {
        System.out.println("knife bit");
    }
}
