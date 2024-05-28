package abstractAnimals;

public class Passerotto extends Animale implements IVolante {

	public Passerotto () {
		
		this.nome = "Passerotto";
		this.verso = "chip-chip";
	    this.alimentazione = "granivoro";
	    
	}

	@Override
	public void mangia() {
		System.out.println("io sono un : " + alimentazione);
	}
	

	@Override
	public void verso() {
		System.out.println("io faccio : " + verso);

	}
	
	@Override
	public void vola() {
		System.out.println("sto volando");		
	}

}
