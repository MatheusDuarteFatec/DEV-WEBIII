package br.fatec.projetoNota;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigApp {
    @Bean(name = "appName")
    public String appName() {
        return "Matheus Duarte";
    }
}
