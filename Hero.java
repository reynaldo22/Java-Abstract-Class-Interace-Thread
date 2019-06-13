public abstract class Hero {
	
	private String name;
	private int hp;
	private int attack;
	private int defend;
	
	public abstract void move();
	
	public Hero(String name, int hp, int attack, int defend) {
		super();
		this.name = name;
		this.hp = hp;
		this.attack = attack;
		this.defend = defend;
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


	public int getAttack() {
		return attack;
	}


	public void setAttack(int attack) {
		this.attack = attack;
	}


	public int getDefend() {
		return defend;
	}


	public void setDefend(int defend) {
		this.defend = defend;
	}

}
