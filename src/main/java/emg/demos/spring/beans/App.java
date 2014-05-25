package emg.demos.spring.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {

		/*
		 * ApplicationContext es un bean container se puede usar para instanciar
		 * beans (tambien se puede usar BeanFactory)
		 */
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"emg/demos/spring/beans/beans/beans.xml");

		Person person1 = (Person) context.getBean("person");
		// Person person2 = (Person) context.getBean("person");
		// person.speak();
		// Person person = new Person();
		// person.speak();

		// person1.setTaxId(888);
		Address address = (Address) context.getBean("address");
		Address address2 = (Address) context.getBean("address2");
		// System.out.println(address);

		System.out.println(person1);
		// System.out.println(person2);
		
		System.out.println(address);
		System.out.println(address2);

		FruitBasket basket = (FruitBasket) context.getBean("fruitbasket");
		System.out.println(basket);
		
		
		Jungle jungle = (Jungle)context.getBean("jungle");
		System.out.println(jungle);
		
		((ClassPathXmlApplicationContext) context).close();
	}
}
