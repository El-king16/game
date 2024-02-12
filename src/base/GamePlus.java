package base;

public class GamePlus extends Game{
    private String skill;
    private int s_damage;

    public GamePlus(String name,int hp, int mana, int damage, String skill, int s_damage) {
        super(name, hp, mana, damage);
        this.skill = skill;
        this.s_damage = s_damage;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public int getS_damage() {
        return s_damage;
    }

    public void setS_damage(int s_damage) {
        this.s_damage = s_damage;
    }
}
