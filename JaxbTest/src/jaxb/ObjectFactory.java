package jaxb;

import javax.xml.bind.annotation.XmlRegistry;

@XmlRegistry
public class ObjectFactory {
	public Sample createSample() {
	      return new Sample();
	   }
	public Another createAnother() {
	      return new Another();
	   }
	@SuppressWarnings("rawtypes")
	public MapEntry createMapEntry() {
	      return new MapEntry();
	   }
	
}
