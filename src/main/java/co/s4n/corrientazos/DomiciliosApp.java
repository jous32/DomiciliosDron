package co.s4n.corrientazos;

import co.s4n.corrientazos.controller.DomiciliosController;

public class DomiciliosApp {

	public static void main(String[] args) {
		DomiciliosController domiciliosController = new DomiciliosController();
		domiciliosController.startDronDeliver();
	}

}
