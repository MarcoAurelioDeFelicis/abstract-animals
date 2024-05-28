package abstractAnimals;

public class MAIN {
	public static void main(String[] args) {
		Cane cane = new Cane();
		Aquila aquila = new Aquila();
		Passerotto passerotto = new Passerotto();
		Delfino delfino = new Delfino();		
		
		System.out.println("Nome :" + cane.nome);
		cane.dormi();
		cane.verso();
		cane.mangia();
		cane.nuota();
		
		
		System.out.println("\nNome :" + aquila.nome);
		aquila.dormi();
		aquila.verso();
		aquila.mangia();
		aquila.vola();
		
		System.out.println("\nNome :" + passerotto.nome);
		passerotto.dormi();
		passerotto.verso();
		passerotto.mangia();
		passerotto.vola();
		
		System.out.println("\nNome :" + delfino.nome);
		delfino.dormi();
		delfino.verso();
		delfino.mangia();
		delfino.nuota();
	}


}
