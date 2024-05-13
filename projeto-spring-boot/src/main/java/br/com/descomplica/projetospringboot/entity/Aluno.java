package br.com.descomplica.projetospringboot.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "aluno")
public class Aluno {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "aluno_id")
  private int alunoId;

  @Column(name = "aluno_nome")
  private String alunoNome;

  @ManyToOne
  @JoinColumn(name = "turma_id")
  private Turma turma;

  public int getAlunoId() {
    return alunoId;
  }

  public void setAlunoId(int alunoId) {
    this.alunoId = alunoId;
  }

  public String getAlunoNome() {
    return alunoNome;
  }

  public void setAlunoNome(String alunoNome) {
    this.alunoNome = alunoNome;
  }

  public Turma getTurma() {
    return turma;
  }

  public void setTurma(Turma turma) {
    this.turma = turma;
  }
}
