package p1;

	public class Monster extends Human{
		
	Hero hero;

		public Monster (int hp, String name) {
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

		public void setHero(Hero hero) {
		    this.hero = hero;
		}


		public void attack(Object s, int dmg) {
		    if (s instanceof Hero) {
		        Hero h = (Hero) s;
		        System.out.println("Hero hp: " + h.getHp());
		        System.out.println("monster has " + dmg + " damage");
		        h.decreaseHp(dmg);
		        System.out.println("Hero hp is now: " + h.getHp());
		        System.out.println("--------------------------");
		    }
		
		}
		
}
