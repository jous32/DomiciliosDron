package co.s4n.corrientazos.domain;

import java.util.List;
import co.s4n.corrientazos.domain.enums.*;

public class Route {
	List<StepEnum> route;

	
	public Route(List<StepEnum> route) {
		this.route = route;
	}


	public List<StepEnum> getRoute() {
		return route;
	}

}
