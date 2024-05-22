package abstractAnimals;

public class Cane extends Animale {

	public Cane () {
		
		this.nome = "Cane";
		this.verso = "bau";
	    this.alimentazione = "onnivoro";
		
	}

	@Override
	public void mangia() {
		System.out.println("io sono un : " + alimentazione);
	}
	

	@Override
	public void verso() {
		System.out.println("io faccio : " + verso);

	}

}
