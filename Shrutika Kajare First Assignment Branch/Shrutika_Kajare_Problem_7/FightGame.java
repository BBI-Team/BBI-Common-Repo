import java.util.*;
import java.io.*;

class Human
{
	public String behaviour;
	public int HP=10;
	
}

class Hero extends Human
{
	String behaviour="Good";
	int lightAttack=HP;
	int hasHighIQ(int monsterPoint)
	{
		if(lightAttack>monsterPoint)
			lightAttack+=5;
		else
			lightAttack--;
		return lightAttack;
	}
}


class Monster extends Human
{
	String behaviour="Bad";
	int darkAttack=HP;
	int hasBigbody(int heroPoint)
	{
		if(darkAttack>heroPoint)
			darkAttack+=5;
		else
			darkAttack--;
		return darkAttack;
	}	
}


public class FightGame
{
	public static void main(String args[])
	{
		
		int heroPower=0,monsterPower=0;
		Hero h=new Hero();
		Monster m=new Monster();
		System.out.println("Enter 3 Monster body :-");
		Scanner mscan=new Scanner(System.in);
			int bb1=mscan.nextInt();
			int bb2=mscan.nextInt();
			int bb3=mscan.nextInt();
			
			
		System.out.println("Enter 3 Hero IQ :-");
		Scanner hscan=new Scanner(System.in);
			int iq1=mscan.nextInt();
			int iq2=mscan.nextInt();
			int iq3=mscan.nextInt();
			
		heroPower=h.hasHighIQ(bb1);
		heroPower=h.hasHighIQ(bb2);
		heroPower=h.hasHighIQ(bb3);
		System.out.println("Monster bodies are as follows... "+bb1+" "+bb2+" "+bb3);
		
		
		monsterPower=m.hasBigbody(iq1);
		monsterPower=m.hasBigbody(iq2);
		monsterPower=m.hasBigbody(iq3);
		System.out.println("Hero IQs are as follows... "+iq1+" "+iq2+" "+iq3);
		
		
		System.out.println("Hit Points of Hero= "+heroPower+" Hit points of Monster= "+monsterPower);
		if(monsterPower>heroPower)
			System.out.println("Monster is winner");
		else if(heroPower>monsterPower)
			System.out.println("Hero is winner");
		else
			System.out.println("Tie");
	}
}
