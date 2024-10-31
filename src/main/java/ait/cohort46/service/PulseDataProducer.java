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
                .id(random.nextInt(100))
                .timestamp(System.currentTimeMillis())
                .payload(random.nextInt(200))
                .build();
    }
}
