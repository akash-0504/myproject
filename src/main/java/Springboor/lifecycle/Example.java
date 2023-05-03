package Springboor.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Example {
	
	private String sub;

	public String getSub() {
		return sub;
	}

	public void setSub(String sub) {
		this.sub = sub;
	}

	public Example() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Example [sub=" + sub + "]";
	}
	
	@PostConstruct
	public void start() {
		System.out.println("this method is start");
		
	}
	@PreDestroy
	private void end() {
		System.out.println("this method is end");
		
	}
	
	

}
