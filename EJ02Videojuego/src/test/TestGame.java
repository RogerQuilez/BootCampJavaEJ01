package test;

import videojuego.Arco;
import videojuego.Combat;
import videojuego.Espada;
import videojuego.Inteligent;
import videojuego.Mage;
import videojuego.Personaje;
import videojuego.Pray;
import videojuego.Spell;
import videojuego.Strength;
import videojuego.Warrior;

public class TestGame {
	
	public static void main(String[] args) {
		
		//Weapons
		Spell spell = new Spell(50);
		Espada espada = new Espada(23);
		Pray pray = new Pray(30);
		Arco arco = new Arco(28);
		
		//Personaje 1
		Inteligent inteligent = new Inteligent("Inteligencia", 20);
		Mage mage = new Mage("Mage", spell, inteligent, 200);
		Personaje p = new Personaje("Gandalf", mage);
		p.getWeapon(spell);
		
		//Personaje 2
		Strength strength = new Strength("Strength", 20);
		Warrior warrior = new Warrior("Warrior", espada, strength, 200);
		Personaje p2 = new Personaje("Aragorn", warrior);
		p2.getWeapon(espada);
		
		Combat combat = new Combat();
		System.out.println(combat.startCombat(p, p2));
		
	}

}
