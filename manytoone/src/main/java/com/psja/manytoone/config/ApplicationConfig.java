package com.psja.manytoone.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

import com.psja.manytoone.entity.EmployeeEntity;
import com.psja.manytoone.repo.AppRepositoryImpl;

import jakarta.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.transaction.TransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

@Configuration
@EnableJpaRepositories( repositoryBaseClass = AppRepositoryImpl.class)//, value = "com.psja.manytoone.repo" )
public class ApplicationConfig {

	//@Autowired
	//private EntityManager entityManager;
	
	@Bean
	DataSource dataSource() {
		DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
		driverManagerDataSource.setUrl("jdbc:mysql://localhost:3306/orchestra");
		driverManagerDataSource.setUsername("root");
		driverManagerDataSource.setPassword("root");
		driverManagerDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		
		return driverManagerDataSource;
	}
	
	@Bean("CUSTOM_TX_MANAGER")
	TransactionManager transactionManager() {
	
		JpaTransactionManager jpaTransactionManager = new JpaTransactionManager();
		
		jpaTransactionManager.setEntityManagerFactory( entityManagerFactory().getObject() );
		jpaTransactionManager.setDataSource( dataSource() );
		
		return jpaTransactionManager;
	}
	
	
	@Bean
	LocalContainerEntityManagerFactoryBean entityManagerFactory() {
		LocalContainerEntityManagerFactoryBean localContainerEntityManagerFactoryBean = new LocalContainerEntityManagerFactoryBean();
		localContainerEntityManagerFactoryBean.setDataSource( dataSource() );
		localContainerEntityManagerFactoryBean.setPackagesToScan( "com.psja.manytoone.entity" );
		
		HibernateJpaVendorAdapter hibernateJpaVendorAdapter = new HibernateJpaVendorAdapter();
		hibernateJpaVendorAdapter.setGenerateDdl(Boolean.TRUE);
		hibernateJpaVendorAdapter.setShowSql(Boolean.TRUE);
		
		localContainerEntityManagerFactoryBean.setJpaVendorAdapter(hibernateJpaVendorAdapter);
				
		return localContainerEntityManagerFactoryBean;
	}
	
	@Bean
	EmployeeEntity employeeEntity() {
		return new EmployeeEntity();
	}
	
	@Bean
	AppRepositoryImpl appRepositoryImpl() {
		return new AppRepositoryImpl<EmployeeEntity, String>( EmployeeEntity.class, entityManagerFactory().getObject().createEntityManager() );
	}
}
