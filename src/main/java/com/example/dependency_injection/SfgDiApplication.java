package com.example.dependency_injection;

import com.example.dependency_injection.controller.*;
import com.example.other.controller.OtherController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan(basePackages = {"com.example.dependency_injection","com.example.other"})
@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {


		ApplicationContext applicationContext =  SpringApplication.run(SfgDiApplication.class, args);

		System.out.println("primary");
		TestController testController = applicationContext.getBean(TestController.class);
		System.out.println(testController.getText());

		System.out.println("constructor");
		ConstructorInjectedGreetingController constructorInjectedGreetingController = applicationContext.getBean(ConstructorInjectedGreetingController.class);
		System.out.println(constructorInjectedGreetingController.getGreeting());


		System.out.println("property");
		PropertyInjectedGreetingController propertyInjectedGreetingController = applicationContext.getBean(PropertyInjectedGreetingController.class);
		System.out.println(propertyInjectedGreetingController.getGreeting());


		System.out.println("Setter");
		SetterInjectedGreetingController setterInjectedGreetingController = applicationContext.getBean(SetterInjectedGreetingController.class);
		System.out.println(setterInjectedGreetingController.getGreeting());


		System.out.println("profile");
		I18NController i18NController = applicationContext.getBean(I18NController.class);
		System.out.println(i18NController.getText());

		System.out.println("scan other package");
		OtherController otherController = applicationContext.getBean(OtherController.class);
		System.out.println(otherController.talk());


	}

}
