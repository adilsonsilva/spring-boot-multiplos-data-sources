package br.com.hdi.conex.datasource.model.cliente.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.hdi.conex.datasource.model.cliente.entities.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
