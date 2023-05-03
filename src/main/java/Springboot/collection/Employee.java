package Springboot.collection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {
	
	private String name;
	private List<String> phoneList;
	private Set<String> addressSet;
	private Map<String, String> courseMap;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getPhoneList() {
		return phoneList;
	}
	public void setPhoneList(List<String> phoneList) {
		this.phoneList = phoneList;
	}
	public Set<String> getAddressSet() {
		return addressSet;
	}
	public void setAddressSet(Set<String> addressSet) {
		this.addressSet = addressSet;
	}
	public Map<String, String> getCourseMap() {
		return courseMap;
	}
	public void setCourseMap(Map<String, String> courseMap) {
		this.courseMap = courseMap;
	}
	
	
	public Employee(String name, List<String> phoneList, Set<String> addressSet, Map<String, String> courseMap) {
		super();
		this.name = name;
		this.phoneList = phoneList;
		this.addressSet = addressSet;
		this.courseMap = courseMap;
	}
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	

}

