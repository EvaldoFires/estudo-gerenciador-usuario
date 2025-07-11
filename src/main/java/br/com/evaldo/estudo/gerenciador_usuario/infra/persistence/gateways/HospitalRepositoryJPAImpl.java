package br.com.evaldo.estudo.gerenciador_usuario.infra.persistence.gateways;

import br.com.evaldo.estudo.gerenciador_usuario.adapter.mapper.HospitalMapper;
import br.com.evaldo.estudo.gerenciador_usuario.application.gateways.HospitalRepository;
import br.com.evaldo.estudo.gerenciador_usuario.domain.models.Hospital;
import br.com.evaldo.estudo.gerenciador_usuario.infra.exceptions.RecursoNaoEncontradoException;
import br.com.evaldo.estudo.gerenciador_usuario.infra.persistence.entities.HospitalEntity;
import br.com.evaldo.estudo.gerenciador_usuario.infra.persistence.repository.HospitalRepositoryJPA;

import java.util.List;

public class HospitalRepositoryJPAImpl implements HospitalRepository {

    private final HospitalRepositoryJPA repository;
    private final HospitalMapper mapper;

    public HospitalRepositoryJPAImpl(HospitalRepositoryJPA repository, HospitalMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public Hospital cadastrarHospital(Hospital hospital) {
        HospitalEntity hospitalRecebido = mapper.toEntity(hospital);
        HospitalEntity hospitalSalvo = repository.save(hospitalRecebido);
        return mapper.toDomain(hospitalSalvo);
    }

    @Override
    public Hospital buscarPorId(Long id) {
        HospitalEntity hospital = repository.findById(id).orElseThrow(() -> new RecursoNaoEncontradoException(
                "hospital não encontrado com id: " + id
        ));
        return mapper.toDomain(hospital);
    }

    @Override
    public List<Hospital> listarTodos() {
        return repository.findAll()
                .stream()
                .map(mapper::toDomain)
                .toList();
    }

    @Override
    public void deletarPorId(Long Id) {
        this.buscarPorId(Id);
        repository.deleteById(Id);
    }
}
