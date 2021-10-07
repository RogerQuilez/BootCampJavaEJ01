package test;

import java.util.LinkedList;
import java.util.List;

import computer.Computer;
import computer.Monitor;
import computer.Periferico;
import computer.PlacaBase;
import computer.Procesador;
import computer.Ram;
import computer.Raton;
import computer.TarjetaGrafica;
import computer.Teclado;

public class TestComputer {
	
	public static void main(String[] args) {
		
		List<Periferico> perifericos = new LinkedList<Periferico>();
		List<TarjetaGrafica> tarjetasGraficas = new LinkedList<TarjetaGrafica>();
		List<Ram> rams = new LinkedList<Ram>();
		Computer computer = new Computer();
		Monitor monitor = new Monitor();
		Teclado teclado = new Teclado();
		Raton raton = new Raton();
		PlacaBase placaBase = new PlacaBase();
		Procesador procesador = new Procesador();
		Ram ram = new Ram();
		TarjetaGrafica tarjetaGrafica = new TarjetaGrafica();
		
		// PlacaBase object
		placaBase.setMarca("ASUS");
		placaBase.setModel("ASUS");
		placaBase.setPrecio(300);
		
		// Procesador
		procesador.setHz(75);
		procesador.setMarca("AMD");
		procesador.setPrecio(200);
		
		// Ram
		ram.setGeneracion("Decima");
		ram.setHz(75);
		ram.setPrecio(300);
		
		//Perifericos
		monitor.setMarca("ACER");
		monitor.setHz(75);
		monitor.setPrecio(120);
		monitor.setTamaño(23.5);	
		
		teclado.setMarca("HP");
		teclado.setTipo("Mecánico");
		teclado.setPrecio(50);
		
		raton.setMarca("ACER");
		raton.setBotones(23);
		raton.setInalambrico(true);
		raton.setPeso(120);
		raton.setPrecio(55);
		
		// Tarjeta Grafica
		tarjetaGrafica.setMarca("NVIDIA");
		tarjetaGrafica.setModelo("GTX1060");
		tarjetaGrafica.setPrecio(500);
		tarjetaGrafica.setRam(ram);
		
		// Adding to Lists
		perifericos.add(monitor);
		perifericos.add(teclado);
		perifericos.add(raton);
		tarjetasGraficas.add(tarjetaGrafica);
		rams.add(ram);
		
		computer.setMarca("Asus");
		computer.setPrecio(2000);
		computer.setListPerifericos(perifericos);
		computer.setListaRam(rams);
		computer.setListTarjetaGrafica(tarjetasGraficas);
		computer.setPlacaBase(placaBase);
		computer.setProcesador(procesador);
		
		System.out.println(computer);
		
		//Calculate Price of Components
		System.out.println("Total price of Components: " + computer.getTotalPriceComponents() + "€");
		
	}
}
