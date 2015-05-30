import javax.xml.ws.Endpoint;
import javax.xml.ws.WebServiceFeature;

import soap.GenericService;


public class StartSoapService {

	public static void main(String[] args) {
		
		Endpoint.publish(
		         "http://localhost:8080/GenericSoap",
		         new GenericService());
	}

}
