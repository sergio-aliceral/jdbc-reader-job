package br.com.aliceraltecnologia.jdbcreaderjob.writer;

import org.springframework.batch.item.ItemWriter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.aliceraltecnologia.jdbcreaderjob.dominio.Cliente;

@Configuration
public class JdbcPagingReaderWriterConfig {
	@Bean
	public ItemWriter<Cliente> jdbcPagingWriter() {
		return clientes -> clientes.forEach(System.out::println);
	}
}
