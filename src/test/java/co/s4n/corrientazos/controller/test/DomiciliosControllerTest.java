package co.s4n.corrientazos.controller.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import co.s4n.corrientazos.controller.DomiciliosController;
import co.s4n.corrientazos.domain.Direction;
import co.s4n.corrientazos.domain.Dron;
import co.s4n.corrientazos.domain.Position;
import co.s4n.corrientazos.domain.Route;
import co.s4n.corrientazos.domain.enums.DirectionEnum;
import co.s4n.corrientazos.domain.enums.StepEnum;

public class DomiciliosControllerTest {

	DomiciliosController domiciliosController = new DomiciliosController();
	@Test
	public void moveAheadTest() {
		List<StepEnum> listStepEnums = new ArrayList<StepEnum>();
		listStepEnums.add(StepEnum.AHEAD);
		listStepEnums.add(StepEnum.AHEAD);
		listStepEnums.add(StepEnum.LEFT);
		listStepEnums.add(StepEnum.AHEAD);
		listStepEnums.add(StepEnum.RIGHT);
		listStepEnums.add(StepEnum.AHEAD);
		listStepEnums.add(StepEnum.RIGHT);
		listStepEnums.add(StepEnum.RIGHT);
		listStepEnums.add(StepEnum.AHEAD);
		List<Route> listRoute = new ArrayList<Route>();
		listRoute.add(new Route(listStepEnums));
		Dron dron = new Dron("droneName", new Position(0, 0,  new Direction(DirectionEnum.NORTH)), listRoute);
		domiciliosController.deliver(dron);
		assertEquals(2, dron.getPosition().getX());
		assertEquals(-1, dron.getPosition().getY());
		assertEquals(DirectionEnum.SOUTH, dron.getPosition().getDirection().getDirection());
	}
}
