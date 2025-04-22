package br.com.anm.projetocrud.produtos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import br.com.anm.projetocrud.produtos.controle.Interabe;
import br.com.anm.projetocrud.produtos.modelo.ProdutoModelo;
import br.com.anm.projetocrud.produtos.modelo.RespostaModelo;
import br.com.anm.projetocrud.produtos.repositorio.ProdutoRepositorio;

@Service
public class ProdutoService {

  @Autowired
  private ProdutoRepositorio pr;

  @Autowired
  private RespostaModelo rm;

  public Iterable<ProdutoModelo> lister() {
    return pr.findAll();
  }

  public Interabe<ProdutoModelo> listar() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'listar'");
  }

  public ResponseEntity<?> cadastrarAlterar(ProdutoModelo pm, String acao) {
    if (pm.getNome().equals("")) {
      rm.setMensagem("O nome do produto é obrigatório!");
      return new ResponseEntity<RespostaModelo>(rm, HttpStatus.BAD_REQUEST);
    } else if (pm.getMarca().equals("")) {
      rm.setMensagem("A marca do produto é obrigatório!");
      return new ResponseEntity<RespostaModelo>(rm, HttpStatus.BAD_REQUEST);
    } else {
      if (acao.equals("cadastrar")) {
        return new ResponseEntity<ProdutoModelo>(pr.save(pm), HttpStatus.CREATED);
      } else {
        return new ResponseEntity<ProdutoModelo>(pr.save(pm), HttpStatus.OK);

      }
    }
  }

  public ResponseEntity<RespostaModelo> remover(long codigo) {
    pr.deleteById(codigo);
    rm.setResposta("O produto foi removido com sucesso!");
    return new ResponseEntity<RespostaModelo>(rm, HttpStatus.OK);
  }
}
