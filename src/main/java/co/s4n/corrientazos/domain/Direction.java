package co.s4n.corrientazos.domain;

import co.s4n.corrientazos.domain.enums.DirectionEnum;

public class Direction {
	
	
	public Direction(DirectionEnum direction) {
		this.direction = direction;
	}

	private DirectionEnum direction;

	public DirectionEnum getDirection() {
		return direction;
	}

	public void setDirection(DirectionEnum direction) {
		this.direction = direction;
	}
	
	public void turnRight() {
		if(this.direction.equals(DirectionEnum.NORTH)) {
			this.direction = DirectionEnum.EAST;
		} else if (this.direction.equals(DirectionEnum.SOUTH)) {
			this.direction = DirectionEnum.WEST;
		} else if (this.direction.equals(DirectionEnum.EAST)) {
			this.direction = DirectionEnum.SOUTH;
		} else if (this.direction.equals(DirectionEnum.WEST)) {
			this.direction = DirectionEnum.NORTH;
		}
	}
	
	public void turnLeft() {
		if(this.direction.equals(DirectionEnum.NORTH)) {
			this.direction = DirectionEnum.WEST;
		} else if (this.direction.equals(DirectionEnum.SOUTH)) {
			this.direction = DirectionEnum.EAST;
		} else if (this.direction.equals(DirectionEnum.EAST)) {
			this.direction = DirectionEnum.NORTH;
		} else if (this.direction.equals(DirectionEnum.WEST)) {
			this.direction = DirectionEnum.SOUTH;
		}
	}
}
