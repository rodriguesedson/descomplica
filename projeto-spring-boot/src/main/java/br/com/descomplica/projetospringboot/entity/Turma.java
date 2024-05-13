package br.com.descomplica.projetospringboot.entity;

import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "turma")
public class Turma {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int turmaId;

  @OneToMany(mappedBy = "turme")
  private Set<Turma> turmas;

  public int getTurmaId() {
    return turmaId;
  }

  public void setTurmaId(int turmaId) {
    this.turmaId = turmaId;
  }

  public Set<Turma> getTurmas() {
    return turmas;
  }

  public void setTurmas(Set<Turma> turmas) {
    this.turmas = turmas;
  }

  
}
