package co.s4n.corrientazos.domain.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import co.s4n.corrientazos.domain.Direction;
import co.s4n.corrientazos.domain.Position;
import co.s4n.corrientazos.domain.enums.DirectionEnum;

public class PositionTest {
		
	@Test
	public void moveAheadTest() {
		Position position = new Position(0,0, new Direction(DirectionEnum.NORTH));
		position.moveAhead();
		assertEquals(1, position.getX());
	}

}
