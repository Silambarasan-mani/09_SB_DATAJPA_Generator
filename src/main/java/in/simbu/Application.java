package in.simbu;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.simbu.Entity.OrderEntity;
import in.simbu.Repository.OrderRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(Application.class, args);
		
		OrderRepository repository = run.getBean(OrderRepository.class);
		System.out.println("For jenkin test purpose");
		OrderEntity st = new OrderEntity();
		st.setOrdBy("moviya");
		st.setOrdDate(new Date());
		
		OrderEntity save = repository.save(st);
		System.out.println(save);
		run.close();
		
		
		
	}

}
