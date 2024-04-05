package kg.geeks.game.players;
public class Bomber extends Hero{
    public Bomber(int health, int damage, String name) {
        super(health, damage, SuperAbility.BOMBER, name);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        if (this.getHealth() <= boss.getDamage() ){
            boss.setHealth(boss.getHealth()-100);
            System.out.println("Bomber has exploded");
        }
    }
}