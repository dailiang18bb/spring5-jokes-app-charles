package charles.spring.joke.spring5jokesappcharles;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:chuck-config.xml")
public class Spring5JokesAppCharlesApplication {

    public static void main(String[] args) {
        SpringApplication.run(Spring5JokesAppCharlesApplication.class, args);
    }

}
