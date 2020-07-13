package p1;

	public class Hero extends Human
	{
		 Monster monster;

		
		public Hero(int hp, String name) 
		{
			this.hp = hp;
		    this.name = name;

		}

		public int getHp() {
		    return this.hp;
		}

		public String getName() {
		    return this.name;
		}

		public void decreaseHp(int dmg) {
		    this.hp = getHp() - dmg;
		}

		public void setMonster(Monster monster) {
		    this.monster = monster;
		}

		
		public void attack(Object s, int dmg) {
		    if (s instanceof Monster) {
		        Monster m = (Monster) s;
		        System.out.println("Monster hp: " + m.getHp());
		        System.out.println("Hero has " + dmg + " damage");
		        m.decreaseHp(dmg);
		        System.out.println("Monster hp is now: " + m.getHp()+"\n");
		        System.out.println("--------------------------");
		    }
		}
		}


