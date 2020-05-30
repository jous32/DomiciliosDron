package co.s4n.corrientazos.domain.enums;

public enum StepEnum {
	AHEAD("A"), LEFT("I"), RIGHT("D");

	private String name;

	private StepEnum(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public static StepEnum findByName(String abbr){
	    for(StepEnum v : values()){
	        if( v.name().equals(abbr)){
	            return v;
	        }
	    }
	    return null;
	}

}
