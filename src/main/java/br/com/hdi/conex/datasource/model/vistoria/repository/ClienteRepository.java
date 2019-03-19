package br.com.hdi.conex.datasource.model.vistoria.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.hdi.conex.datasource.model.vistoria.entities.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
