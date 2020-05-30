package co.s4n.corrientazos.domain.enums;

public enum DirectionEnum {
	NORTH("Norte"), SOUTH("Sur"), WEST("Oeste"), EAST("Este");

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