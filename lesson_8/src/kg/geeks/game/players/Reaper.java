package kg.geeks.game.players;
public class Reaper extends Hero{

    int health30 = this.getHealth()/100*30;
    int health15 = this.getHealth()/100*15;
    private boolean rat = false;

    public Reaper(int health, int damage,  String name) {
        super(health, damage, SuperAbility.RAT, name);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        if (this.getHealth()<=health15) {
            rat =true;
            this.setDamage(this.getDamage()*3);
        }
        if (this.getHealth()<=health30 && !rat){
            this.setDamage(this.getDamage()*2);
        }
    }
}

