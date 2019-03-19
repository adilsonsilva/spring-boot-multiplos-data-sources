package br.com.hdi.conex.datasource.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.hdi.conex.datasource.model.user.respository.UserRepository;
import br.com.hdi.conex.datasource.model.vistoria.entities.Cliente;
import br.com.hdi.conex.datasource.model.vistoria.repository.ClienteRepository;

@RestController
public class ApiController {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private ClienteRepository clienteRepository;

	@GetMapping("api/sqlServer")
	public ResponseEntity<String> baseHans() {

		String retorno = userRepository.findUserByCpf("1111111111");

		return new ResponseEntity<>(retorno, HttpStatus.OK);

	}

	@GetMapping("api/postgres")
	public ResponseEntity<String> basesqlServer() {

		Optional<Cliente> retorno = clienteRepository.findById(1);

		Cliente cl = retorno.get();

		return new ResponseEntity<>(cl.getNome(), HttpStatus.OK);

	}

}
