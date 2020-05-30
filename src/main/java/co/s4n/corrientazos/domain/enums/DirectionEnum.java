package co.s4n.corrientazos.domain.enums;

public enum DirectionEnum {
	NORTH("NORTH"), SOUTH("SOUTH"), WEST("WEST"), EAST("EAST");

	private String name;

	private DirectionEnum(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}