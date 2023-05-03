package Springboot.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {
	public static void main(String[] args) {
		
	       ApplicationContext context =  new ClassPathXmlApplicationContext("Springboot/ci/ci_config.xml");
	           Person p = (Person) context.getBean("person1");
	           Adition sum = (Adition) context.getBean("add");
	           
	           System.out.println(p);
	           System.out.println(sum);
	           
		
	}
	
   

} 
