package jaxb;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;

@XmlType
public class ListWrapper<T> {
	 List<T> list;


	public ListWrapper(List<T> childs) {
		this();
		this.list = childs;
	}

	public ListWrapper() {
		super();
		this.list = new ArrayList<T>();
	}
	@XmlElementWrapper(name="list")
	@XmlElement(name="item")
	public List<T> getList() {
		return list;
	}

	public void setList(List<T> list) {
		this.list = list;
	}
	 
	 
}
