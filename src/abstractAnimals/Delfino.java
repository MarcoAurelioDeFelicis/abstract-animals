package abstractAnimals;

public class Delfino extends Animale implements VolaNuota {

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
	
	@Override
	public void faiNuotare() {
		System.out.println("sto nuotando");
	}


	@Override
	public void faiVolare() {
				
	}

}
