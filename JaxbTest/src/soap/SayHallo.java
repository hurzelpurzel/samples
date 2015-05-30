package soap;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class SayHallo extends Command {

	@Override
	public String execute() {
		
		return "Hallooooooooo !!!!!";
	}

}
