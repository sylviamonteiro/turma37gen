package entities;

public class Preguica extends Animal {
	private boolean capacidadeEscalar;

	public Preguica(String nome, int idade, boolean capacidadeEscalar) {
		super(nome, idade);
		this.capacidadeEscalar=capacidadeEscalar;
		
	}

	public boolean isCapacidadeEscalar() {
		return capacidadeEscalar;
	}

	public void setCapacidadeEscalar(boolean capacidadeEscalar) {
		this.capacidadeEscalar = capacidadeEscalar;
	}
   public void emitirSom() {
	   System.out.println("Barulho das folhas");
   }
   public void correr() {
	   System.out.println("Movendo devagar......");
   }
   
}
