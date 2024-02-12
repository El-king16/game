package base;

public class Heroes extends GamePlus{
    private int gold;

    public Heroes(String name,int hp, int mana, int damage, String skill, int s_damage, int gold) {
        super(name, hp, mana, damage, skill, s_damage);
        this.gold = gold;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }
}
