package br.com.fiap.CacheRedis.controller;

import br.com.fiap.CacheRedis.entity.Produto;
import br.com.fiap.CacheRedis.service.IProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

@RestController
@RequestMapping("estoque")
public class ProdutoController {

    @Autowired
    private IProdutoService produtoService;

    @GetMapping("produto/{id}")
    public ResponseEntity<Produto> getProdutoById(@PathVariable("id") Long id) {
        Produto produto = produtoService.getProdutoById(id);
        return new ResponseEntity<Produto>(produto, HttpStatus.OK);
    }

    @GetMapping("produtos")
    public ResponseEntity<List<Produto>> getAllProdutos() {
        List<Produto> lista = produtoService.getAllProdutos();
        return new ResponseEntity<List<Produto>>(lista, HttpStatus.OK);
    }

    @PostMapping("produto")
    public ResponseEntity<Void> addProduto(@RequestBody Produto produto,
                                           UriComponentsBuilder builder) {
        Produto savedProduto = produtoService.addProduto(produto);
        HttpHeaders headers = new HttpHeaders();

        headers.setLocation(builder.path("/produto/{id}").buildAndExpand(savedProduto.id).toUri());
        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
    }

    @PutMapping("produto")
    public ResponseEntity<Produto> updateProduto(@RequestBody Produto produto) {
        produtoService.updateProduto(produto);
        return new ResponseEntity<Produto>(produto, HttpStatus.OK);
    }

    @DeleteMapping("produto/{id}")
    public ResponseEntity<Void> deleteArticle(@PathVariable("id") Long id) {
        produtoService.deleteProduto(id);
        return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
    }

}
