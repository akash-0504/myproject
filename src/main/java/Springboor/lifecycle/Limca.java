package Springboor.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Limca implements InitializingBean,DisposableBean{
	private int price;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Limca() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Limca [price=" + price + "]";
	}

	public void afterPropertiesSet() throws Exception {
		//this method is init method
		// TODO Auto-generated method stub
		System.out.println("taking limca : init ");
	}

	public void destroy() throws Exception {
		//this method is destroy method
		// TODO Auto-generated method stub
		System.out.println("after taking limca botal throw dustbin");
	}
	
	

}
