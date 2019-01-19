package guru.springframework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import guru.springframework.controllers.ConstructorInjectedController;
import guru.springframework.controllers.GetterInjectedController;
import guru.springframework.controllers.MyController;
import guru.springframework.controllers.PropertyInjectedController;
import guru.springframework.examplebeans.FakeDataSource;
import guru.springframework.examplebeans.FakeJmsBroker;

@SpringBootApplication
@ComponentScan(basePackages = {"guru.services", "guru.springframework"})
public class DiDemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);

		MyController controller = (MyController) ctx.getBean("myController");
		
		FakeDataSource fakeDataSource = (FakeDataSource) ctx.getBean(FakeDataSource.class);		
		System.out.println(fakeDataSource.getUser());
		System.out.println(fakeDataSource.getPassword());
		System.out.println(fakeDataSource.getUrl());
		
		FakeJmsBroker fakeJmsBroker = (FakeJmsBroker) ctx.getBean(FakeJmsBroker.class);
		System.out.println(fakeJmsBroker.getUsername());
		System.out.println(fakeJmsBroker.getPassword());
		System.out.println(fakeJmsBroker.getUrl());

	}
}
