package soap;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class TschauCommand extends Command {

	@Override
	public String execute() {
		
		return "Und tschüss !!";
	}

}
