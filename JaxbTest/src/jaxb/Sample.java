package jaxb;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlRootElement
public class Sample {
	
	private String name;
	private List<String> childs;
	public void setChilds(List<String> childs) {
		this.childs = childs;
	}

	private Map<String,List<String>> other;
	private Map<String,List<Integer>> other2;
	private Map<String,List<Another>> another;
	
	public void setOther(Map<String, List<String>> other) {
		this.other = other;
	}
	public Sample() {
		super();
		this.childs = new ArrayList<String>();
		this.other = new HashMap<String,List<String>>();
		this.other2 = new HashMap<String,List<Integer>>();
		this.another = new HashMap<String,List<Another>>();
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public List<String> getChilds() {
		return childs;
	}
	@XmlJavaTypeAdapter(value=StringMapAdapter.class)
	public Map<String, List<String>> getOther() {
		return other;
	}
	@XmlJavaTypeAdapter(value=IntegerMapAdapter.class)
	public Map<String, List<Integer>> getOther2() {
		return other2;
	}
	public void setOther2(Map<String, List<Integer>> other2) {
		this.other2 = other2;
	}
	@XmlJavaTypeAdapter(value=AnotherMapAdapter.class)
	public Map<String, List<Another>> getAnother() {
		return another;
	}
	public void setAnother(Map<String, List<Another>> another) {
		this.another = another;
	}

	
	
}
