
public interface Magicable {
//	default void castSpell(){// default itu udh ada isi jadi ga usah di override
//		System.out.println("Casting Spell...");
//	}
	
	// di interface bisa declare var tapi harus static final jadi punya interface dan gabisa di ganti
	int castintime=3; //bold italic artinta static final
	
	void castSpell(Hero h);// ini kalo harus di override
}
