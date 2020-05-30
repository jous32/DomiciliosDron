package co.s4n.corrientazos.controller;


import java.util.ArrayList;
import java.util.List;

import co.s4n.corrientazos.domain.Direction;
import co.s4n.corrientazos.domain.Dron;
import co.s4n.corrientazos.domain.Position;
import co.s4n.corrientazos.domain.Route;
import co.s4n.corrientazos.domain.data.DataRepository;
import co.s4n.corrientazos.domain.enums.DirectionEnum;
import co.s4n.corrientazos.domain.enums.StepEnum;

public class DomiciliosController {
	
	DataRepository dataRepository = new DataRepository();
	
	public void startDronDeliver() {
		List<Dron> listDrons = setupAllDrons();
		for (Dron dron : listDrons) {
			List<Position> listFinalPositon = deliver(dron);
			dataRepository.createReport("out"+dron.getName()+".txt", listFinalPositon);
		}
	}
	
	
	private List<Dron> setupAllDrons() {
		List<Dron> listDrons = new ArrayList<Dron>();
		List<String> listFiles =dataRepository.listFilesForFolder();
		for (String currentFileFull : listFiles) {
			String fileName = currentFileFull.split("/")[currentFileFull.split("/").length-1];
			List<Route> listRoutes = dataRepository.readRoutes(currentFileFull);
			String droneName = fileName.substring(2,4);
			listDrons.add(new Dron(droneName, new Position(0, 0,  new Direction(DirectionEnum.NORTH)), listRoutes));
		}
		return listDrons;
	}
	
	private List<Position> deliver(Dron dron) {
		List<Route> listRoute = dron.getListRoutes();
		List<Position> listFinalPositions = new ArrayList<Position>();
		for (Route route : listRoute) {
			List<StepEnum> listSteps = route.getRoute();
			for (StepEnum step : listSteps) {
				dron.updatePosition(calculateMovement(dron.getPosition(), step));
			}
			listFinalPositions.add(new Position(dron.getPosition().getX(), dron.getPosition().getY(),dron.getPosition().getDirection()));
		}
		return listFinalPositions;
	}
	
	private Position calculateMovement(Position position, StepEnum stepEnum) {
		if(stepEnum.name().equals(StepEnum.AHEAD.name())) {
			position.moveAhead();
		}else if (stepEnum.name().equals(StepEnum.LEFT.name())) {
			position.getDirection().turnLeft();
		}else if (stepEnum.name().equals(StepEnum.RIGHT.name())) {
			position.getDirection().turnRight();
		} else {
			System.out.println("Invalid movement");
		}
		System.out.println(position.toString());
		return position;
	}
	

	

	

}