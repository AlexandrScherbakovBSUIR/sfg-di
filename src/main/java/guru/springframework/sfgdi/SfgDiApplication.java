package guru.springframework.sfgdi;

import guru.springframework.sfgdi.controllers.ConstructorInjectedController;
import guru.springframework.sfgdi.controllers.MyController;
import guru.springframework.sfgdi.controllers.PropertyInjectedController;
import guru.springframework.sfgdi.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {

		ApplicationContext AppCntx =  SpringApplication.run(SfgDiApplication.class, args);

		System.out.println("--------- Primary");
		MyController myController = (MyController) AppCntx.getBean("myController");
        System.out.println(myController.getGreeting());

		System.out.println("--------- Property");

		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) AppCntx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("--------- Setter");

		SetterInjectedController setterInjectedController = (SetterInjectedController) AppCntx.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());

		System.out.println("--------- Constructor");

		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) AppCntx.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());



	}

}
