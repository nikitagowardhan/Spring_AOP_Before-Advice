import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import groovy.util.Factory;
import model.Student;

public class Test {

	public static void main(String[] args) {
		
	Resource resourse= new ClassPathResource("applicationContext.xml");
	
	BeanFactory factory= new XmlBeanFactory(resourse);
	
	Student st = factory.getBean("proxy",Student.class);
		 
     st.a();
	}

}
