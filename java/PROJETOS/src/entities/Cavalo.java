package entities;

public class Cavalo extends Animal {
	boolean capacidadeCoice;

	public Cavalo(String nome, int idade, boolean capacidadeCoice) {
		super(nome, idade);
		this.capacidadeCoice = capacidadeCoice;
	}

	public boolean isCapacidadeCoice() {
		return capacidadeCoice;
	}

	public void setCapacidadeCoice(boolean capacidadeCoice) {
		this.capacidadeCoice = capacidadeCoice;
	}
	@Override
	public void correr() {
		System.out.println("Correndo...");
	}
   @Override
   public void emitirSom() {
	   System.out.println("Relinchando...");
   }
}
