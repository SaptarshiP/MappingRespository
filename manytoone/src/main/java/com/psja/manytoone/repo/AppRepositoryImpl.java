package com.psja.manytoone.repo;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.util.Assert;

import jakarta.persistence.EntityManager;


//@Repository
//@Transactional
public class AppRepositoryImpl<P, K> extends SimpleJpaRepository<P, K>
					implements AppRepository<P, K>{

	private final EntityManager em;
	
	@Value("${error.null.entity.data.error.message}")
	private String ENITY_SAVE_NULL_ERROR_MESSAGE;
	
	
	public AppRepositoryImpl(Class<P> domainClass, EntityManager em) {
		super(domainClass, em);
		this.em = em;
	}
	
	@Override
	@Transactional("CUSTOM_TX_MANAGER")
	public <T extends P>T save( T entity ) {
		System.out.println( "Inserting into save" );
		Assert.notNull(entity, ENITY_SAVE_NULL_ERROR_MESSAGE);
		//em.getTransaction().begin();
		em.persist( entity );
		//em.getTransaction().commit();
		System.out.println( "Exiting from save" );
		return entity;
	}

}
