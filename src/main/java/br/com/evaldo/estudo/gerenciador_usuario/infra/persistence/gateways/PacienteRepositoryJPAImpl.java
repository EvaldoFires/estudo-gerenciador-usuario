package br.com.evaldo.estudo.gerenciador_usuario.infra.persistence.gateways;

import br.com.evaldo.estudo.gerenciador_usuario.adapter.mapper.PacienteMapper;
import br.com.evaldo.estudo.gerenciador_usuario.application.gateways.PacienteRepository;
import br.com.evaldo.estudo.gerenciador_usuario.domain.models.Paciente;
import br.com.evaldo.estudo.gerenciador_usuario.infra.exceptions.RecursoNaoEncontradoException;
import br.com.evaldo.estudo.gerenciador_usuario.infra.persistence.entities.PacienteEntity;
import br.com.evaldo.estudo.gerenciador_usuario.infra.persistence.repository.PacienteRepositoryJPA;

import java.util.List;

public class PacienteRepositoryJPAImpl implements PacienteRepository {

    private final PacienteRepositoryJPA repository;
    private final PacienteMapper mapper;

    public PacienteRepositoryJPAImpl(PacienteRepositoryJPA repository, PacienteMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public Paciente cadastrarPaciente(Paciente paciente) {
        PacienteEntity pacienteRecebido = mapper.toEntity(paciente);
        PacienteEntity pacienteSalvo = repository.save(pacienteRecebido);
        return mapper.toDomain(pacienteSalvo);
    }

    @Override
    public Paciente buscarPorCPF(String cpf) {
        PacienteEntity paciente = repository.findById(cpf).orElseThrow(() -> new RecursoNaoEncontradoException(
                "Paciente não encontrado com cpf: " + cpf
        ));
        return mapper.toDomain(paciente);
    }

    @Override
    public List<Paciente> listarTodos() {
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
