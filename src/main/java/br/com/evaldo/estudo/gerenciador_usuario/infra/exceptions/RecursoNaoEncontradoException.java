package br.com.evaldo.estudo.gerenciador_usuario.infra.exceptions;

public class RecursoNaoEncontradoException extends RuntimeException {
  public RecursoNaoEncontradoException(String message) {
    super(message);
  }
}
