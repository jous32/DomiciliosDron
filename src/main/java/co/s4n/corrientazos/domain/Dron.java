package co.s4n.corrientazos.domain;

import java.util.List;

public class Dron {

	private String name;
	private Position position;
	private List<Route> listRoutes;
	
	
	public Dron(String name, Position position,  List<Route> listRoutes) {
		this.name = name;
		this.position = position;
		this.listRoutes = listRoutes;
	}

	public String getName() {
		return name;
	}
	
	public Position getPosition() {
		return position;
	}
	
	public List<Route> getListRoutes() {
		return listRoutes;
	}
	
	public void updatePosition(Position position) {
		this.position = position;
	}
	
}
