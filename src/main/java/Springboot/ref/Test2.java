package Springboot.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {

	public static void main(String[] args) {
		
		ApplicationContext context  =  new ClassPathXmlApplicationContext("Springboot/ref/refconfig.xml");
	        A tempA = (A) context.getBean("aref");
	        System.out.println(tempA.getX());
	        System.out.println(tempA.getObjB().getY());
	        System.out.println(tempA);
	        

	}

}
