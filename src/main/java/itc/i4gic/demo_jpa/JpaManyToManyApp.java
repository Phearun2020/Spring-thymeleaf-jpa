package itc.i4gic.demo_jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class JpaManyToManyApp {
   
   public void main(String [] args) {
      ConfigurableApplicationContext configurableApplicationContext = SpringApplication.run(JpaManyToManyApp.class, args);
   }
}
