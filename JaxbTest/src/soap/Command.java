package soap;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlType
@XmlSeeAlso(value={SayHallo.class,TschauCommand.class})
public  abstract class Command {
	private int sequence;

	
	
	@XmlAttribute
	
	public int getSequence() {
		return sequence;
	}

	public void setSequence(int sequence) {
		this.sequence = sequence;
	}

	public   abstract String execute() ;

	
	
	
}
