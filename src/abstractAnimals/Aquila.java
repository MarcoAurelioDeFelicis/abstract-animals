package abstractAnimals;

public class Aquila extends Animale implements VolaNuota {
	
	public Aquila () {
		
		this.nome = "Aquila";
		this.verso = "KAKA!";
	    this.alimentazione = "carnivoro";
		
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
	public void faiNuotare() {
		
	}


	@Override
	public void faiVolare() {
		System.out.println("sto volando");		
	}

}
