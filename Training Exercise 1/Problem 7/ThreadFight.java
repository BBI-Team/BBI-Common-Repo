package p1;

import java.util.Random;

public class ThreadFight
{
		Hero hero;
		Monster monster;
		Random random = new Random();
		Object lock = new Object();

		public ThreadFight(Hero hero, Monster monster)
		{
		    this.hero = hero;
		    this.monster = monster;
		}

		public void hitMonster()
		{

		    while (monster.getHp() > 0 && hero.getHp() > 0) 
		    {
		        synchronized (lock)
		        {
		            try {
		                Thread.sleep(2000);
		            } catch (InterruptedException e) {
		                e.printStackTrace();
		            }
		            hero.attack(monster, random.nextInt(20));

		        }
		        if (monster.getHp() < 0) {
		            System.out.println("Hero won.");
		        }
		    }
		}

		public void hitHero()
		{

		    while (hero.getHp() > 0 && monster.getHp() > 0)
		    {
		        synchronized (lock)
		        {
		            try {
		                Thread.sleep(2000);
		            } catch (InterruptedException e) {
		                e.printStackTrace();
		            }
		            monster.attack(hero, random.nextInt(20));

		        }
		        if (hero.getHp() < 0)
		        {
		            System.out.println("Monster won.");
		        }
		    }
		}
}

