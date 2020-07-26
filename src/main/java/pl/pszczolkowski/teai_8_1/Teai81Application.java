package pl.pszczolkowski.teai_8_1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class Teai81Application {

    public static void main(String[] args) {
        SpringApplication.run(Teai81Application.class, args);
    }

}
