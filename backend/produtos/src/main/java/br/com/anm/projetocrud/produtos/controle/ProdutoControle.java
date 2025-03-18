package br.com.anm.projetocrud.produtos.controle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.anm.projetocrud.produtos.modelo.ProdutoModelo;
import br.com.anm.projetocrud.produtos.service.ProdutoService;

@RestController
public class ProdutoControle {
@Autowired
  private ProdutoService ps;

  @PostMapping("/cadastrar")
  public ResponseEntity<?> cadastrar(@RequestBody ProdutoModelo pm){
    return ps.cadastrar(pm);
  }

    @GetMapping("/listar")
  public Interabe<ProdutoModelo>listar(){
      return ps.listar();
}

  @GetMapping("/")
  public String rota() {
    return "API está funcionando!";
  }
}
