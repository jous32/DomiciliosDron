package co.s4n.corrientazos.domain.enums;

public enum StepEnum {
	AHEAD("A"), LEFT("I"), RIGHT("D");

	private String values;

	private StepEnum(String values) {
		this.values = values;
	}

	public String getValues() {
		return values;
	}

	public void setValues(String values) {
		this.values = values;
	}
	
	public static StepEnum findByValues(String abbr){
	    for(StepEnum v : values()){
	        if( v.getValues().equals(abbr)){
	            return v;
	        }
	    }
	    return null;
	}

}
