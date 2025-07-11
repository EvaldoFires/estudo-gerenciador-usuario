package br.com.evaldo.estudo.gerenciador_usuario.infra.persistence.gateways;

import br.com.evaldo.estudo.gerenciador_usuario.adapter.mapper.EnfermeiroMapper;
import br.com.evaldo.estudo.gerenciador_usuario.application.gateways.EnfermeiroRepository;
import br.com.evaldo.estudo.gerenciador_usuario.domain.models.Enfermeiro;
import br.com.evaldo.estudo.gerenciador_usuario.infra.exceptions.RecursoNaoEncontradoException;
import br.com.evaldo.estudo.gerenciador_usuario.infra.persistence.entities.EnfermeiroEntity;
import br.com.evaldo.estudo.gerenciador_usuario.infra.persistence.repository.EnfermeiroRepositoryJPA;

import java.util.List;


public class EnfermeiroRepositoryJPAImpl implements EnfermeiroRepository {

    private final EnfermeiroRepositoryJPA repository;
    private final EnfermeiroMapper mapper;

    public EnfermeiroRepositoryJPAImpl(EnfermeiroRepositoryJPA repository, EnfermeiroMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public Enfermeiro cadastrarEnfermeiro(Enfermeiro enfermeiro) {
        EnfermeiroEntity enfermeiroRecebido = mapper.toEntity(enfermeiro);
        EnfermeiroEntity enfermeiroSalvo = repository.save(enfermeiroRecebido);
        return mapper.toDomain(enfermeiroSalvo);
    }

    @Override
    public Enfermeiro buscarPorCPF(String cpf) {
        EnfermeiroEntity enfermeiro = repository.findById(cpf).orElseThrow(() -> new RecursoNaoEncontradoException(
                "Enfermeiro não encontrado com o cpf: " + cpf
        ));
        return mapper.toDomain(enfermeiro);
    }

    @Override
    public List<Enfermeiro> listarTodos() {
        return repository.findAll()
                .stream()
                .map(mapper::toDomain)
                .toList();
    }

    @Override
    public void deletarPorCPF(String cpf) {
        this.buscarPorCPF(cpf);
        repository.deleteById(cpf);
    }
}
