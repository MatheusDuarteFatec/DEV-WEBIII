package br.fatec.projetoNota;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ProjetoNotaApplication {

	@Autowired
	@Qualifier("appName")
	private String appName;

	@GetMapping("/provas")
	public String avaliarAluno(@RequestParam(name = "nome") String nome,
							   @RequestParam(name = "notaP1") double notaP1,
							   @RequestParam(name = "notaP2") double notaP2) {

		double media = (notaP1 + notaP2) / 2;
		String status = media >= 6 ? "Aprovado" : "Reprovado";

		return String.format("%s você está %s com média: %.2f.", nome, status, media);
		// http://localhost:1234/provas?nome=Matheus&notaP1=7.2&notaP2=8.6
	}

	@GetMapping("/imc")
	public String avaliarIMC (@RequestParam(name = "nome") String nome,
							  @RequestParam(name = "peso") double peso,
							  @RequestParam(name = "altura") double altura) {
		double imc = peso / (altura * altura);
		String statusIMC = null;

		if (imc <= 19) {
			statusIMC = "Abaixo do peso";
		} else if (imc <= 25) {
			statusIMC = "Peso normal";
		} else if (imc <= 30) {
			statusIMC = "Sobre peso";
		} else if (imc <= 35) {
			statusIMC = "Obesidade I";
		} else if (imc <= 40) {
			statusIMC = "Obesidade II";
		} else {
			statusIMC = "Obedidade III";
		}

		return String.format("%s seu IMC: %.2f considerado como: %s", nome, imc, statusIMC);
		// http://localhost:1234/imc?nome=Pedro&peso=53&altura=1.68
	}

	public static void main(String[] args) {
		SpringApplication.run(ProjetoNotaApplication.class, args);
	}
}