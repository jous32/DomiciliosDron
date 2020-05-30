
package co.s4n.corrientazos.domain.data.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import co.s4n.corrientazos.domain.Direction;
import co.s4n.corrientazos.domain.Position;
import co.s4n.corrientazos.domain.data.DataRepository;
import co.s4n.corrientazos.domain.enums.DirectionEnum;
import co.s4n.corrientazos.domain.enums.StepEnum;

public class DataRepositoryTest {
	
	private final String RESOURCES_TEST_PATH = "src/test/resources/";
	DataRepository dataRepository = new DataRepository();
	
	
	@Test
	public void readRoutesTest() {
		assertEquals(3, dataRepository.readRoutes(RESOURCES_TEST_PATH+"in01.txt").size());
	}
	
	@Test
	public void convertListPositionsToStringTest() {
		List<Position> listPositions = new ArrayList<Position>();
		listPositions.add(new Position(0, 0, new Direction(DirectionEnum.NORTH)));
		assertEquals("(0, 0) direccion Norte\n" , dataRepository.convertListPositionsToString(listPositions));
	}
	
	@Test
	public void convertlineToRouteTest() {
		String line = "AIDAIIAADAAA";
		assertEquals(StepEnum.AHEAD, dataRepository.convertlineToRoute(line).getRoute().get(1));
		assertEquals(StepEnum.LEFT, dataRepository.convertlineToRoute(line).getRoute().get(2));
		assertEquals(StepEnum.RIGHT, dataRepository.convertlineToRoute(line).getRoute().get(3));
	}
	
}