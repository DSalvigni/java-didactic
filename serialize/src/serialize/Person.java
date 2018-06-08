package serialize;
import java.io.Serializable;

public class Person implements Serializable {

	private static final long serialVersionUID = -2369730954826263635L;
	private String Name;
	private String ID;
	private String token;
	
	public Person(String Name,String ID) {
		this.Name=Name;
		this.ID=ID;
	}

	public String returnObj() {
		token = "ID: "+ID+" Name: "+Name;
		return token;
	}
	
}


