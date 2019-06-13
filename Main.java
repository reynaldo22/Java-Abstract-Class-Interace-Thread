
public class Main {

    public Main() {

        Warior w = new Warior("Sudirman",100, 20, 20);
        Mage m = new Mage("Penyihir",300, 10, 10);
        Healer h = new Healer("Dokter",50, 0, 0);

        m.castSpell(w);
        h.castSpell(w);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e){
            System.out.println("error!");
        }

        System.out.println("Warior HP : "+w.getHp());
    }

    public static void main(String[] args) {
        new Main();
    }

}
