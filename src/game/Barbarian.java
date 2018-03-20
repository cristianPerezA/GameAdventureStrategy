package game;

public class Barbarian extends Character {

	public Barbarian(WeaponBehaviour w) {
		super(w);
	}
	
	@Override
	public void display() {
	// TODO Auto-generated method stub

		System.out.println("You are a strong, hulky barbarian. Añadimos texto en esta linea");
		System.out.println("You are a strong, hulky barbarian. User 1 añade linea. Resolvemos conflicto directamente");
		System.out.println("Barbaro 2 ataca a barbaro 1 y gana. Fin del juego :)");
		System.out.println("Barbaro 2 gana siempre");
		System.out.println("Barbaro ganador");

		
	}
}
