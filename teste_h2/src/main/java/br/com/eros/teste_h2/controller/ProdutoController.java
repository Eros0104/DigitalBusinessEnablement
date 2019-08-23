package br.com.eros.teste_h2.controller;

import br.com.eros.teste_h2.entity.Produto;
import br.com.eros.teste_h2.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("produto")
public class ProdutoController {
    @Autowired
    private ProdutoRepository repository;

    @GetMapping("/cadastrar")
    public String cadastrar(){
        return "produto";
    }

    @GetMapping("/buscar")
    public String buscar(){
        return "buscar";
    }

    @PostMapping("/buscar")
    public String cadastrar(int codigo, Model model){
        Optional<Produto> produto = repository.findById(codigo);
        model.addAttribute("prod",produto);
        return "resultado";
    }

    @PostMapping("/cadastrar")
    public String cadastrar(Produto produto){

        repository.save(produto);
        return "sucesso";
    }
}
