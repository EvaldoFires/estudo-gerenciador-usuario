package br.com.evaldo.estudo.gerenciador_usuario.adapter.dto;

public record EnderecoDTO(
        String cep,
        String estado,
        String cidade,
        String bairro,
        String rua,
        String numero,
        String complemento
) {
}
