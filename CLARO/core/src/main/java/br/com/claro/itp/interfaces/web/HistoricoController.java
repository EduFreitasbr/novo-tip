package br.com.claro.itp.interfaces.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HistoricoController {

    @GetMapping("/inicio")
    public String inicio(){
        return "Projeto ITP";
    }
}
