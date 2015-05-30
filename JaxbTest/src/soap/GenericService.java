package soap;

import javax.jws.WebService;

@WebService(endpointInterface="soap.GenericServiceIf")

public class GenericService implements GenericServiceIf {

	public String excute(Command cmd){
		return cmd.execute();
		
	}
}
