package videojuego;

public class Arco extends Arma {
	
	public Arco() {
		
	}
	 
	public Arco(int damage) {
		super(damage);
	}
	
	public int getWeaponDamage() {
		return this.getClase() instanceof Warrior ? 
				this.getDamage() + this.getClase().getAttribute().getStats() : this.getDamage();
	}

}
