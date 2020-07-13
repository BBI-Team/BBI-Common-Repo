import java.io.*;
import java.util.*;
class Humans
{
	int hp;
	String behavior;
	public Humans(String b)
	{
		hp=10;
		behavior=b;
		
	}
}
class Hero extends Humans
{
	public Hero(String behavior)
	{
		super(behavior);
	}
	
	public int heroAttack()
	{
		int lightattack;
		int highIQ=20;
		lightattack=hp;
		try
		{
			Scanner s=new Scanner(System.in);
			System.out.println("Enter IQ for hero between 1 to 20");
			int iq=s.nextInt();
			if(iq==highIQ)
				{
					lightattack=lightattack+5;
				
				}
				else
					lightattack--;
		}
		catch(Exception e)
		{
			System.out.println("Error:"+e);
		}
		return lightattack;
	}
}
class Monster extends Humans
{
	public Monster(String behavior)
	{
		super(behavior);
	}
	Scanner s=new Scanner(System.in);
	public int monsterAttack()
	{
		int darkattack;
		int bigBody=20;
		darkattack=hp;
		try
		{
			
			System.out.println("Enter Body Size for Monster between 1 to 20");
			int size=s.nextInt();
			if(size==bigBody)
				{
					darkattack=darkattack+5;
				
				}
			else
					darkattack--;
		}
		catch(Exception e)
		{
			System.out.println("Error:"+e);
		}
		return darkattack;
	}
	
}

class Hero_Monster_Game
{
	public static void main(String v[])
	{
		int choice;
		int hp1=0;
		int hp2=0;
		Hero hr=new Hero("Good");
		Monster ms=new Monster("Bad");
		hp1=hr.heroAttack();
		hp2=ms.monsterAttack();
		if(hp1>hp2)
		{
			System.out.println("Hero win the match!With point:"+hp1);
			System.out.println("Monster Lossed!with point:"+hp2);
		}
		else
		{
			System.out.println("Monster win the match!With points:"+hp2);
			System.out.println("Hero loseed!With point:"+hp1);
		
		}
		
	}
}