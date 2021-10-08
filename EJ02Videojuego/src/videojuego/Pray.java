package videojuego;

public class Pray extends Arma {
	
	public Pray() {
		
	}

	public Pray(int damage) {
		super(damage);
	}
	
	public int getWeaponDamage() {
		return this.getClase() instanceof Healer ? 
				this.getDamage() + this.getClase().getAttribute().getStats() : this.getDamage();
	}
	
}
