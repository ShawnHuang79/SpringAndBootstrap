package com.hsin.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

@Configuration
public class DataConfig {

//	public DataSource getDataSource() {
//		return new EmbeddedDatabaseBuilder()
//				.setType(EmbeddedDatabaseType.HSQL)
//				.addScript("resources/schema.sql")
//				.build();
//	}
	//TODO 改成下面這樣就可以不用打startDBManager那段，應該可行，待測試
	@Bean
	public DataSource getDataSource() {
    DriverManagerDataSource dataSource = new DriverManagerDataSource();
    dataSource.setDriverClassName("com.mysql.jdbc.Driver");
    dataSource.setUrl("jdbc:mysql://localhost:3306/advanced4");
    dataSource.setUsername("root");
    dataSource.setPassword("1234");

    return dataSource;
}
	
	@Bean
	public JdbcOperations jdbcTemplate(DataSource dataSource) {
		return new JdbcTemplate(dataSource);
	}
	@Bean
	public NamedParameterJdbcTemplate getNamedParameterJdbcTemplate() {
		return new NamedParameterJdbcTemplate(getDataSource());
	}
//	@PostConstruct
//	public void startDBManager() {
//		DatabaseManagerSwing.main(
//				new String[] { "--url", "jdbc:hsqldb:mem:testdb", "--user", "sa", "--password", "" }
//				);
//		
//	}
//	public void startDBManager() {
//		DatabaseManagerSwing.main(
//				new String[] { "--url", "jdbc:mysql://localhost:3306/advanced4", "--user", "root", "--password", "1234" }
//		);
//	}
}
