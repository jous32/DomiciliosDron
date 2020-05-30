package co.s4n.corrientazos.domain.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import co.s4n.corrientazos.domain.Direction;
import co.s4n.corrientazos.domain.Position;
import co.s4n.corrientazos.domain.enums.DirectionEnum;

public class DirectionTest {
		
	@Test
	public void turnRightTest() {
		Position position = new Position(0,0, new Direction(DirectionEnum.NORTH));
		position.getDirection().turnRight();
		assertEquals(DirectionEnum.EAST, position.getDirection().getDirection());
	}
	
	@Test
	public void turnLeftTest() {
		Position position = new Position(0,0, new Direction(DirectionEnum.NORTH));
		position.getDirection().turnLeft();
		assertEquals(DirectionEnum.WEST, position.getDirection().getDirection());
	}
}
