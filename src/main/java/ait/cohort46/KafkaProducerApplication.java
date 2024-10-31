package ait.cohort46;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Random;
import java.util.function.Supplier;

@SpringBootApplication
public class KafkaProducerApplication {
    public static void main(String[] args) {
       ConfigurableApplicationContext context = SpringApplication.run(KafkaProducerApplication.class, args);
        try {
            Thread.sleep(30000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            context.close();
        }
    }

}
