package soap;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;


@WebService(name="Generic", targetNamespace="http://hurzelpurzel.de",portName="Generic ServicePort")
public interface GenericServiceIf {
	@WebMethod public String excute(Command cmd);
}