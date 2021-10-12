package app;
import entities.Animal;
import entities.Cachorro;
import entities.Cavalo;
import entities.Preguica;

public class AnimalApp {
public static void main(String[] args) {
	Animal cachorro1 = new Cachorro("Spike", 11, true);
	Animal cavalo1 = new Cavalo ("Pocotó", 5, true);
	Animal preguica1 = new Preguica("Veloz", 40, true);
	
	System.out.println(cachorro1.getNome());
	cachorro1.correr();
	cachorro1.emitirSom();
	System.out.println(cavalo1.getNome());
	cavalo1.correr();
	cavalo1.emitirSom();
	System.out.println(preguica1.getNome());
	preguica1.correr();
	preguica1.emitirSom();
	
  }
}
