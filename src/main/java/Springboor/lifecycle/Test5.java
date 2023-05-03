package Springboor.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test5 {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Springboor/lifecycle/pep_config.xml");
//		Pepsi pp =  (Pepsi) context.getBean("pep1");
//		System.out.println(pp);
//		
		((AbstractApplicationContext) context).registerShutdownHook();
		
//		System.out.println("************************************");
//		
//		Limca l1  = (Limca) context.getBean("lim1");
//		System.out.println(l1);
		
		Example e1  = (Example)context.getBean("exa1");
		System.out.println(e1);
		
//		
	}

}
