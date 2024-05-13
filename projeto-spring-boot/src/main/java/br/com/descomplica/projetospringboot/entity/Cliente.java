package br.com.descomplica.projetospringboot.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="cliente")
public class Cliente {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "cliente_id")
  private int clienteId;

  @Column(name = "cliente_nome")
  private String clienteNome;

  @OneToOne
  @JoinColumn(name = "telefone_id", referencedColumnName = "telefone_id")
  private Telefone telefone;

  public int getClienteId() {
    return clienteId;
  }

  public void setClienteId(int clienteId) {
    this.clienteId = clienteId;
  }

  public String getClienteNome() {
    return clienteNome;
  }

  public void setClienteNome(String clienteNome) {
    this.clienteNome = clienteNome;
  }

  public Telefone getTelefone() {
    return telefone;
  }

  public void setTelefone(Telefone telefone) {
    this.telefone = telefone;
  }

  
}
