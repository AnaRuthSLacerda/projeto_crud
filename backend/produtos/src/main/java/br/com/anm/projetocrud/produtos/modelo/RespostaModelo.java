package br.com.anm.projetocrud.produtos.modelo;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Component
@Setter
@Getter
public class RespostaModelo {
  private String resposta;

  public void setMensagem(String string) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'setMensagem'");
  }

}
