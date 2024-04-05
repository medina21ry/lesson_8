package kg.geeks.game.players;
public class Avrora extends Hero {
    private int recievedDamage = 0;
    private int round = 0;
    private boolean interedInvesibility = false;

    public Avrora(int health, int damage, String name) {
        super(health, damage, SuperAbility.INVISIBILITY, name);
    }


    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        if (!interedInvesibility) {
            System.out.println("Avrora super ability is working");
            this.setHealth(this.getHealth() + boss.getDamage());
            recievedDamage += boss.getDamage();
            round++;
        }
        if (round == 2) {
            interedInvesibility = true;
            if (interedInvesibility){
                boss.setHealth(boss.getHealth() - recievedDamage);
                System.out.println("Avrora returned damage to boss: " + recievedDamage);
            }
        }
        System.out.println("Round: " + round + " intered invesibility: " + interedInvesibility);

    }
}