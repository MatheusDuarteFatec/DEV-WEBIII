package br.fatec.ProjetoSpringConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigProjeto {

    @Bean(name = "appName")
    public String appName() {
        return "Matheus Duarte oiiiii";
    }

    @Bean(name = "appIdade")
    public String appIdade() {
        return "19";
    }
}