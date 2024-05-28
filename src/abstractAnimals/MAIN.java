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
		cane.faiNuotare();
		
		
		System.out.println("\nNome :" + aquila.nome);
		aquila.dormi();
		aquila.verso();
		aquila.mangia();
		aquila.faiVolare();
		
		System.out.println("\nNome :" + passerotto.nome);
		passerotto.dormi();
		passerotto.verso();
		passerotto.mangia();
		passerotto.faiVolare();
		
		System.out.println("\nNome :" + delfino.nome);
		delfino.dormi();
		delfino.verso();
		delfino.mangia();
		delfino.faiNuotare();
	}


}
