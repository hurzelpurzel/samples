package jaxb;

import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class MapEntry<T> {
	
	 String key;
	
	ListWrapper<T> childs;
	
	public MapEntry() {
		super();
		
	}

	public MapEntry(String key, List<T> childs) {
		super();
		this.key = key;
		this.childs = new ListWrapper<T>(childs);
	}
	@XmlAttribute
	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}
	
	public ListWrapper<T> getChilds() {
		return childs;
	}

	public void setChilds(ListWrapper<T> childs) {
		this.childs = childs;
	}

	
	
	

}
