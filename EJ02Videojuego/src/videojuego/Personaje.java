package videojuego;

import java.util.Date;

public class Personaje {
	
	private static int countId;
	private int id;
	private String name;
	private Date createdAt;
	private Clase clase;
	
	public Personaje(String name, Clase clase) {
		this.id = ++Personaje.countId;
		this.createdAt = new Date();
		this.name = name;
		this.clase = clase;
	}

	public static int getCountId() {
		return countId;
	}

	public static void setCountId(int countId) {
		Personaje.countId = countId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Clase getClase() {
		return clase;
	}

	public void setClase(Clase clase) {
		this.clase = clase;
	}
	
	public void attack(Personaje p) {
		
		int damageRecived = this.calculateCritic();
		p.getClase().setLive(p.getClase().getLive() - damageRecived);
		
		System.out.println("The character " + p.getName() + " recived " + damageRecived + " Damage" +
				"\n Current Live: " + p.getClase().getLive());
	}
	
	public int calculateCritic() {
		Arma arma = this.getClase().getArma();
		int weaponDamage = this.clase.getArma().getWeaponDamage();
		int damageRecived;
		
		if (arma instanceof Espada) {
			damageRecived = (int) (Math.random() * (20 - weaponDamage) + weaponDamage);
		} else if (arma instanceof Spell) {
			damageRecived = (int) (Math.random() * (30 - weaponDamage) + weaponDamage);
		} else if (arma instanceof Arco) {
			damageRecived = (int) (Math.random() * (10 - weaponDamage) + weaponDamage);
		} else {
			damageRecived = (int) (Math.random() * (15 - weaponDamage) + weaponDamage);
		}
		
		return damageRecived;
	}
	
	public void getWeapon(Arma arma) {
		this.getClase().setArma(arma);
		arma.setClase(this.getClase());
	}
	
}
