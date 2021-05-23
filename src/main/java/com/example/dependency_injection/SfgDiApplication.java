package com.example.dependency_injection;

import com.example.dependency_injection.controller.ConstructorInjectedGreetingController;
import com.example.dependency_injection.controller.PropertyInjectedGreetingController;
import com.example.dependency_injection.controller.SetterInjectedGreetingController;
import com.example.dependency_injection.controller.TestController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

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


	}

}
