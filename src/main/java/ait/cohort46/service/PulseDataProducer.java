package ait.cohort46.service;

import ait.cohort46.dto.PulseDto;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.Random;
import java.util.function.Supplier;

@Service
public class PulseDataProducer {
    private Random random = new Random();

    @Bean
    public Supplier<PulseDto> sendData() {
        return () -> PulseDto.builder()
                .id((int) (System.currentTimeMillis()%100000) + random.nextInt(10000))
                .timestamp(System.currentTimeMillis())
                .payload(random.nextInt(200))
                .build();
    }
}
