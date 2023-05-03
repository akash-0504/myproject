package Springboot.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
	ApplicationContext context =new ClassPathXmlApplicationContext("Springboot/collection/collection_config.xml");
	Employee emp1 = (Employee) context.getBean("emp1");
	
	System.out.println(emp1.getName());
	System.out.println(emp1.getAddressSet());
	System.out.println(emp1.getCourseMap());
	System.out.println(emp1.getPhoneList());
		
		
	}

}
