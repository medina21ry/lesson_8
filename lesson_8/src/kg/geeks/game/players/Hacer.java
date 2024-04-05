package kg.geeks.game.players;

import kg.geeks.game.logic.RPG_Game;

public class Hacer extends Hero{
    public Hacer(int health, int damage, String name) {
        super(health, damage, SuperAbility.HACER, name);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        int hacer = RPG_Game.random.nextInt(150);
        int num = RPG_Game.random.nextInt(heroes.length);
        boss.setHealth(boss.getHealth()-hacer);
        heroes[num].setHealth(heroes[num].getHealth()+hacer);
        System.out.println(this.getName()+"  stealed   "+ hacer + "  health points from boss and gave it to " + heroes[num].getName());
     /*   for (int i = 0; i < heroes.length; i++) {
            i = RPG_Game.random.nextInt(heroes.length);
            heroes[i].setHealth(heroes[i].getHealth()+hacer);
            System.out.println("Hacker take health boss");
            break;
        }*/
    }
}
