package base;

public class Game {
    private String name;
    private int hp;
    private int mana;
    private int damage;

    public Game(String name,int hp, int mana, int damage) {
        this.name = name;
        this.hp = hp;
        this.mana = mana;
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}
