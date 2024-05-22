package abstractAnimals;

public abstract class Animale {
	
	protected String nome;
	protected String verso;
	protected String alimentazione;
	
	public Animale() {
		
	}
	
	public void dormi() {
		System.out.println("Zzzz");
	}
	
	public abstract void mangia ();
	public abstract void verso ();

}
