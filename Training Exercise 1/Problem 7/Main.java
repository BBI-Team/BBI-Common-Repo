package p1;

public class Main {
public static void main(String[] args)
{
    Monster monster = new Monster(10, "monster");
    Hero hero = new Hero (10, "hero");
    ThreadFight tf = new ThreadFight(hero, monster);

    Thread t1 = new Thread (new Runnable(){
       
        public void run() {
            tf.hitHero();
        }
    });

    Thread t2 = new Thread (new Runnable() {
        
        public void run() {
            tf.hitMonster();
        }
    });

    t1.start();
    t2.start();
}
}
