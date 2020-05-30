package co.s4n.corrientazos.domain.data;

import java.util.List;

import co.s4n.corrientazos.domain.Position;
import co.s4n.corrientazos.domain.Route;

public interface IDataRepository {
	
	List<Route> readRoutes(String path);
	
	void createReport(String filename, List<Position> listPositions);

	List<String> listFilesForFolder();
}
