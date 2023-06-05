package com.matheusprata.escola.aluno.infra;

import com.matheusprata.escola.aluno.application.repository.AlunoRepository;
import com.matheusprata.escola.aluno.domain.Aluno;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Repository;

@Repository
@Log4j2
@RequiredArgsConstructor
public class AlunoInfraRepository implements AlunoRepository {
    private final AlunoSpringDataJPARepository alunoSpringDataJPARepository;
    @Override
    public Aluno saveAluno(Aluno aluno) {
        log.info("[inicia] AlunoInfraRepository - saveAluno");
        alunoSpringDataJPARepository.save(aluno);
        log.info("[inicia] AlunoInfraRepository - saveAluno");
        return aluno;
    }
}