package jaxb;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public abstract class GenericMappedListAdapter<T> extends XmlAdapter<ListWrapper<MapEntry<T>>,  Map<String,List<T>>> {

	@Override
	public Map<String, List<T>> unmarshal(ListWrapper<MapEntry<T>> v)
			throws Exception {
		
		 Map<String, List<T>> result = new HashMap<>();
			for (MapEntry<T> iterable_element : v.getList()) {
				result.put(iterable_element.key, iterable_element.getChilds().getList());
			}
			return result;
	}

	@Override
	public ListWrapper<MapEntry<T>> marshal(Map<String, List<T>> v) throws Exception {
		ListWrapper<MapEntry<T>> wr = new ListWrapper<MapEntry<T>>();
		 List<MapEntry<T>> result = new ArrayList<MapEntry<T>>();
		for (Entry<String, List<T>> iterable_element : v.entrySet()) {
			result.add(new MapEntry<T>(iterable_element.getKey(), iterable_element.getValue()));
		}
		wr.setList(result);
		return wr;
	}

}
