
public enum Amici {

	ANIMALE01("GALLUCCI"),
	ANIMALE02("ANDREA"),
	ANIMALE03("PIKKIA"),
	ANIMALE04("PAGA");
	
	private String name;
	
	Amici(String name) {
		this.name=name;	
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
