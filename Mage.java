public class Mage extends Hero implements Magicable{

	public Mage(String name, int hp, int attack, int defend) {
		super(name, hp, attack, defend);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void move() {
		System.out.println("jalan 3 meter(Mage)");
		
	}

	@Override
	public void castSpell(Hero h) {
		System.out.println(this.getName()+"Use Meteor"+" "+h.getName());
		System.out.println(this.getName()+" dealt 100 damage ");
		h.setHp(h.getHp()-100);
	}


}
