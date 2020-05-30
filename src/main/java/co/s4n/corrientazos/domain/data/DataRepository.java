package co.s4n.corrientazos.domain.data;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import co.s4n.corrientazos.domain.Position;
import co.s4n.corrientazos.domain.Route;
import co.s4n.corrientazos.domain.enums.StepEnum;

public class DataRepository implements IDataRepository {

	@Override
	public List<String> listFilesForFolder() {
		List<String> fileNames = new ArrayList<String>();
		ClassLoader loader = Thread.currentThread().getContextClassLoader();
		URL url = loader.getResource("");
		String path = url.getPath();
		for (File pathFile : new File(path).listFiles()) {
			try {
				if (pathFile.getCanonicalPath().endsWith(".txt")) {
					fileNames.add(pathFile.getCanonicalPath());
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return fileNames;
	}

	@Override
	public List<Route> readRoutes(String path) {
		List<Route> listRoutes = new ArrayList<Route>();
		try {
			List<String> allLines = Files.readAllLines(Paths.get(path));
			for (String line : allLines) {
				listRoutes.add(convertlineToRoute(line));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return listRoutes;
	}

	@Override
	public void createReport(String filename, List<Position> listPositions) {
		String content = convertListPositionsToString(listPositions);
		String path = "/tmp/"+ filename;
		try {
			Files.write( Paths.get(path), content.getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public Route convertlineToRoute(String line) {
		List<StepEnum> listStepEnum = new ArrayList<StepEnum>();
		List<String> steps = Arrays.asList(line.split(""));
		for (String step : steps) {
			StepEnum stepEnum = StepEnum.findByValues(step);
			listStepEnum.add(stepEnum);
		}
		return new Route(listStepEnum);
	}
	
	public String convertListPositionsToString(List<Position> listPositions) {
		StringBuilder stringBuilder = new StringBuilder(); 
		for (Position position : listPositions) {
			stringBuilder.append(position.toString());
			stringBuilder.append("\n");
		}
		return stringBuilder.toString();
	}

}
