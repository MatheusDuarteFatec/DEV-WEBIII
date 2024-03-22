package br.fatec.ProjetoSpringConfig;

import org.springframework.stereotype.Service;

@Service
public class ViaCEP {
    public String API = "viacep.com.br/ws/01001000/json/";

    public String retornarCEP {
        return API;
    }

}
