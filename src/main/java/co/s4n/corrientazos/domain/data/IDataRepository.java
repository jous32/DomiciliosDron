package co.s4n.corrientazos.domain.data;

import java.util.List;

import co.s4n.corrientazos.domain.Route;

public interface IDataRepository {
	
	List<Route> readRoutes();
	
	void createReport();
}
