import java.util.Arrays;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import jaxb.Another;
import jaxb.ObjectFactory;
import jaxb.Sample;


public class Main {

	public static void main(String[] args) {
		try {
			Sample item = new Sample();
			item.setName("Pottmeier");
			item.getChilds().add("Jonas");
			item.getChilds().add("Hannah");
			item.getOther().put("Darth Vader",Arrays.asList((new String[]{"Luke","Leia"})));
			item.getOther2().put("42",Arrays.asList((new Integer[]{30,12})));
			item.getAnother().put("Author",Arrays.asList((new Another[]{new Another("Ludger","Pottmeier")})));
			JAXBContext ctx = JAXBContext.newInstance(ObjectFactory.class);
	
			Marshaller m=ctx.createMarshaller();
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			m.marshal(item, System.out);
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
