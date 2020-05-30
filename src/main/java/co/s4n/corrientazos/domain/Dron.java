package co.s4n.corrientazos.domain;

import java.util.List;

import co.s4n.corrientazos.domain.enums.DirectionEnum;

public class Dron {

	private String name;
	private Position position;
	private DirectionEnum directionEnum;
	private List<Route> listRoutes;
	
	
	public Dron(String name, Position position, DirectionEnum directionEnum, List<Route> listRoutes) {
		this.name = name;
		this.position = position;
		this.directionEnum = directionEnum;
		this.listRoutes = listRoutes;
	}

	public String getName() {
		return name;
	}
	
	public Position getPosition() {
		return position;
	}
	
	public DirectionEnum getDirectionEnum() {
		return directionEnum;
	}
	
	public List<Route> getListRoutes() {
		return listRoutes;
	}
	
	
	
}
