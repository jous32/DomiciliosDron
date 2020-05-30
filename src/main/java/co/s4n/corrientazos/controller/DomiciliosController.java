package co.s4n.corrientazos.controller;


import java.util.ArrayList;
import java.util.List;

import co.s4n.corrientazos.domain.Dron;
import co.s4n.corrientazos.domain.Position;
import co.s4n.corrientazos.domain.Route;
import co.s4n.corrientazos.domain.data.DataRepository;
import co.s4n.corrientazos.domain.enums.DirectionEnum;

public class DomiciliosController {
	
	DataRepository dataRepository = new DataRepository();
	
	public void startDronDeliver() {
		List<Dron> listDrons = setupAllDrons();
		//moveDrons
		//generateReports
	}
	
	
	private List<Dron> setupAllDrons() {
		List<Dron> listDrons = new ArrayList<Dron>();
		List<String> listFiles =dataRepository.listFilesForFolder();
		for (String currentFileFull : listFiles) {
			String fileName = currentFileFull.split("/")[currentFileFull.split("/").length-1];
			List<Route> listRoutes = dataRepository.readRoutes(currentFileFull);
			String droneName = fileName.substring(2,4);
			listDrons.add(new Dron(droneName, new Position(0, 0), DirectionEnum.NORTH, listRoutes));
		}
		return listDrons;
	}
}