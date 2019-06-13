
public class Healer extends Hero implements Magicable{

	public Healer(String name, int hp, int attack, int defend) {
		super(name, hp, attack, defend);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void move() {
		System.out.println("Jalan 2 meter(Healer)");
		
	}

	@Override
	public void castSpell(Hero target) {
		System.out.println(this.getName()+"Heal"+target.getName()+"by 20 hp");
		target.setHp(target.getHp()+20); // nambahin HP target
	}

}
