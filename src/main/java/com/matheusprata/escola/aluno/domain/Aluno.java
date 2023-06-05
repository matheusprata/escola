package com.matheusprata.escola.aluno.domain;

import com.matheusprata.escola.aluno.application.api.AlunoRequest;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import java.time.LocalDate;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Entity
public class Aluno {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID idAluno;

    @NotNull(message = "Campo Nome Obrigatório!")
    private String nomeCompleto;
    @NotNull(message = "turma Obrigatório")
    private String turma;
    @Email
    @Column(unique = true)
    private String email;
    private String celular;
    @Enumerated(EnumType.STRING)
    private Sexo sexo;
    private LocalDate dataNascimento;
    @Column(name = "cpf", unique = true, updatable = false)
    private String cpf;
    @NotNull(message = "data matricula é obrigatória")
    private LocalDate dataMatricula;

    public Aluno(AlunoRequest alunoRequest) {
        this.nomeCompleto = alunoRequest.getNomeCompleto().toUpperCase();
        this.turma = alunoRequest.getTurma().toUpperCase();
        this.email = alunoRequest.getEmail().toUpperCase();
        this.celular = alunoRequest.getCelular();
        this.sexo = alunoRequest.getSexo();
        this.dataNascimento = alunoRequest.getDataNascimento();
        this.cpf = alunoRequest.getCpf();
        this.dataMatricula = alunoRequest.getDataMatricula();
    }
}
