import org.springframework.core.io.*;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.xml.*;
public class Test 
{
	public static void main(String[] args) 
	{
		//Resource res=new ClassPathResource("myconfig.xml");
		//Resource res=new ClassPathResource("myconfig1.xml");
		//Resource res=new ClassPathResource("myconfig2.xml");
		Resource res=new ClassPathResource("myconfig3.xml");
		BeanFactory factory=new XmlBeanFactory(res);
		
		DemoBean ob1=(DemoBean)factory.getBean("id2");
		ob1.showMsg();
	}
}