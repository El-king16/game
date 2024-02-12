import java.util.Random;
import base.Game;
public class creeps {

    public static void main(String[] args) {
        Game creep = new Game("Крип", 30, 3, 10);
        Game zombie = new Game("Зомби", 35, 10, 15);
        Game ghoul = new Game("Упырь", 30, 13, 20);
        Game dogs = new Game("Гнилая собака", 25, 7, 20);
        Game e_knight = new Game("Гипнотизированный рекрут", 40, 20, 40);

        Random r = new Random();
        int mobs = r.nextInt(20) + 1;
        System.out.println(mobs);
        switch (mobs){
            case 1, 2, 3, 4, 5, 6:
                System.out.println("На вас напал "+creep.getName()+"\nЗдоровье: "+creep.getHp()+"\nУрон: "+creep.getDamage());
                break;
            case 7, 8, 9, 10, 11, 12:
                System.out.println("На вас напал "+zombie.getName()+"\nЗдоровье: "+zombie.getHp()+"\nУрон: "+zombie.getDamage());
                break;
            case 13, 14, 15, 16:
                System.out.println("На вас напал "+ghoul.getName()+"\nЗдоровье: "+ghoul.getHp()+"\nУрон: "+ghoul.getDamage());
                break;
            case 17, 18, 19:
                System.out.println("На вас напал "+dogs.getName()+"\nЗдоровье: "+dogs.getHp()+"\nУрон: "+dogs.getDamage());
                break;
            case 20:
                System.out.println("На вас напал "+e_knight.getName()+"\nЗдоровье: "+e_knight.getHp()+"\nУрон: "+e_knight.getDamage());
                break;

        }
    }
}
