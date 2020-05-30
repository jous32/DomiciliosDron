package co.s4n.corrientazos.domain;

import java.util.List;
import co.s4n.corrientazos.domain.enums.*;

public class Route {
	List<StepEnum> route;

	public List<StepEnum> getRoute() {
		return route;
	}

	public void setRoute(List<StepEnum> route) {
		this.route = route;
	}

}
