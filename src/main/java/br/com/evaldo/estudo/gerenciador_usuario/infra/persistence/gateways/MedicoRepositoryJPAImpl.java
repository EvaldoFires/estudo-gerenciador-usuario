package br.com.evaldo.estudo.gerenciador_usuario.infra.persistence.gateways;

import br.com.evaldo.estudo.gerenciador_usuario.adapter.mapper.MedicoMapper;
import br.com.evaldo.estudo.gerenciador_usuario.application.gateways.MedicoRepository;
import br.com.evaldo.estudo.gerenciador_usuario.domain.models.Medico;
import br.com.evaldo.estudo.gerenciador_usuario.infra.exceptions.RecursoNaoEncontradoException;
import br.com.evaldo.estudo.gerenciador_usuario.infra.persistence.entities.MedicoEntity;
import br.com.evaldo.estudo.gerenciador_usuario.infra.persistence.repository.MedicoRepositoryJPA;

import java.util.List;

public class MedicoRepositoryJPAImpl implements MedicoRepository {

    private final MedicoRepositoryJPA repository;
    private final MedicoMapper mapper;

    public MedicoRepositoryJPAImpl(MedicoRepositoryJPA repository, MedicoMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }


    @Override
    public Medico cadastrarMedico(Medico medico) {
        MedicoEntity medicoSalvo = repository.save(mapper.toEntity(medico));
        return mapper.toDomain(medicoSalvo);
    }

    @Override
    public Medico buscarPorCPF(String cpf) {
        MedicoEntity entity = repository.findById(cpf).orElseThrow(() ->new RecursoNaoEncontradoException(
                "Medico não encontrado com o cpf: " + cpf
        ));
        return mapper.toDomain(entity);
    }

    @Override
    public List<Medico> listarTodos() {
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
