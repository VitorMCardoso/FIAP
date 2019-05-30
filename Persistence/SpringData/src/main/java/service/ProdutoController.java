package service;

import model.Produto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
public class ProdutoController {

    @Autowired
    public ProdutoService produtoService;

    @GetMapping("/produto")
    public void test(){
        produtoService.add(new Produto(1, "Laranja"));
        produtoService.add(new Produto(2, "Limao"));
        System.out.println(produtoService.findAll());

        produtoService.addAll(Arrays.asList(
                new Produto(3, "Pera"),
                new Produto(4, "Morango"),
                new Produto(5, "Maracuja")
        ));

        System.out.println(produtoService.findAll());
        System.out.println(produtoService.findByName("Maracuja"));
    }
}
