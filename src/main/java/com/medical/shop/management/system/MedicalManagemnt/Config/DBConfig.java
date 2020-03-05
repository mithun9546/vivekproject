package com.medical.shop.management.system.MedicalManagemnt.Config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.medical.shop.management.system.Medical.Managment.Dao.UserDao;
import com.medical.shop.management.system.Medical.Managment.Dao.UserDaoImpl;


@Configuration
public class DBConfig {

	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		// MySQL database we are using
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/medical_shop");
		dataSource.setUsername("root");
		dataSource.setPassword("root");
		return dataSource;
	}

	@Bean
	public JdbcTemplate jdbcTemplate() {
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(dataSource());
		return jdbcTemplate;
	}

	@Bean
	public UserDao UserDAO() {
		UserDaoImpl user = new UserDaoImpl();
		user.setJdbcTemplate(jdbcTemplate());
		return user;
	}
}
