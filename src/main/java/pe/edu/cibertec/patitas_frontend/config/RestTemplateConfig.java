package pe.edu.cibertec.patitas_frontend.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConfig {

    //Para q se hizo esto
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
