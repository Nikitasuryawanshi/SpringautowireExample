package mypack;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("mypack/spring.xml");
		Employee employee=(Employee)applicationContext.getBean("employee");
		System.out.println(employee);
		employee.employeeAddress();

	}

}
