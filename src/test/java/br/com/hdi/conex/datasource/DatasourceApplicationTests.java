package br.com.hdi.conex.datasource;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.annotation.DirtiesContext.ClassMode;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import br.com.hdi.conex.datasource.config.UserConfig;
import br.com.hdi.conex.datasource.config.VistoriaConfig;
import br.com.hdi.conex.datasource.model.user.respository.UserRepository;
import br.com.hdi.conex.datasource.model.vistoria.repository.ClienteRepository;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = { UserConfig.class, VistoriaConfig.class })
@DirtiesContext(classMode = ClassMode.AFTER_CLASS)
public class DatasourceApplicationTests {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private ClienteRepository productRepository;

	@Test
	@Transactional("userTransactionManager")
	public void whenCreatingUser_thenCreated() {
		assertNotNull(userRepository.findUserByCpf("1111111111"));
	}

	@Test
	@Transactional("vistoriaTransactionManager")
	public void whenCreatingProduct_thenCreated() {
		assertNotNull(productRepository.findAll());
	}
}
