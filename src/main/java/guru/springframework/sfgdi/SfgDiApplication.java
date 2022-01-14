package guru.springframework.sfgdi;

import guru.springframework.sfgdi.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {

		ApplicationContext AppCtx =  SpringApplication.run(SfgDiApplication.class, args);

		System.out.println("--------- Profile");

		I18nLanguageController i18nLanguageController =(I18nLanguageController) AppCtx.getBean("i18nLanguageController");
		System.out.println(i18nLanguageController.getGreeding());

		System.out.println("--------- Primary");

		MyController myController = (MyController) AppCtx.getBean("myController");
        System.out.println(myController.getGreeting());

		System.out.println("--------- Property");

		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) AppCtx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("--------- Setter");

		SetterInjectedController setterInjectedController = (SetterInjectedController) AppCtx.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());

		System.out.println("--------- Constructor");

		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) AppCtx.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());



	}

}
