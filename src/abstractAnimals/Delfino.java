package abstractAnimals;

public class Delfino extends Animale {

	public Delfino () {
		
		this.nome = "Delfino";
		this.verso = "*Risata*";
	    this.alimentazione = "pescivoro";
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
