package br.com.anm.projetocrud.produtos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.anm.projetocrud.produtos.controle.Interabe;
import br.com.anm.projetocrud.produtos.modelo.ProdutoModelo;
import br.com.anm.projetocrud.produtos.repositorio.ProdutoRepositorio;

@Service
public class ProdutoService {

  @Autowired
  private ProdutoRepositorio pr;

  public Iterable<ProdutoModelo> lister() {
    return pr.findAll();
  }

  public Interabe<ProdutoModelo> listar() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'listar'");
  }

}
