package co.s4n.corrientazos.domain;

import co.s4n.corrientazos.domain.enums.DirectionEnum;

public class Position {
	private int x;
	private int y;
	private Direction direction;

	public Position(int x, int y, Direction direction) {
		this.x = x;
		this.y = y;
		this.direction = direction;
	}
	
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}	
	
	public Direction getDirection() {
		return direction;
	}

	private void increaseX() {
		x++;
	}
	private void decreaseX() {
		x--;
	}
	private void increaseY() {
		y++;
	}
	private void decreaseY() {
		y--;
	}
	
	public void moveAhead() {
		if(this.getDirection().getDirection().equals(DirectionEnum.NORTH)) {
			increaseX();
		} else if (this.getDirection().getDirection().equals(DirectionEnum.SOUTH)) {
			decreaseX();
		} else if (this.getDirection().getDirection().equals(DirectionEnum.EAST)) {
			increaseY();
		} else if (this.getDirection().getDirection().equals(DirectionEnum.WEST)) {
			decreaseY();
		}
	}

	@Override
	public String toString() {
		return "(" + x + ", " + y + ") direccion " + direction.getDirection().getName() + "";
	}
}
