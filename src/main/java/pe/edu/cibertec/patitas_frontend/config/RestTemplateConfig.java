package pe.edu.cibertec.patitas_frontend.config;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import java.time.Duration;

@Configuration
public class RestTemplateConfig {

    //Creamos el Bean para RestTemplate
    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        //Usar el Builder tiene muchos beneficios como declarar un tiempo de respuestas maximo (Para probar este ejemplo dormimos el back para q funcione)
        return builder
                .setReadTimeout(Duration.ofSeconds(30))
                .build();
    }
}
