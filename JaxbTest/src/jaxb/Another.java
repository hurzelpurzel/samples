package jaxb;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Another")
public class Another {
	private String firstName;
	private String secondName;
	
	
	public Another() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Another(String firstName, String secondName) {
		super();
		this.firstName = firstName;
		this.secondName = secondName;
	}

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getSecondName() {
		return secondName;
	}
	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

}
