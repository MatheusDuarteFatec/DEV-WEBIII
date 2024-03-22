package br.gov.sp.fatec.PrimeiroProjetoInitializr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {
    @GetMapping("/")
    public String index(ModelMap model) {
        model.addAttribute("nomeDoAtributo1", "Página Index");
        return "index";
    }

    @GetMapping("/rota1")
    public String rota1(ModelMap model) {
        model.addAttribute("nomeDoAtributo2", "Página Rota 1");
        return "rota1";
    }

    @GetMapping("/saudacao/{nome}")
    public String saudacao(@PathVariable String nome, ModelMap model) {
        model.addAttribute("nome", nome);
        return "hello";
    }

    @GetMapping("/imc/{peso}/{altura}")
    public float imc(@PathVariable float peso, float altura, ModelMap model) {
        model.addAttribute("peso", peso);
        model.addAttribute("altura", altura);
        float imc = peso + altura * 2;
        return imc;
    }
}