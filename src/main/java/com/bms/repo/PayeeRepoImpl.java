package com.bms.repo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bms.entity.Payee;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class PayeeRepoImpl implements PayeeRepo {
	
	@Autowired
	private EntityManager entityManager;

	@Override
	public boolean addPayee(Payee payee) {
		entityManager.persist(payee);
		return true;
	}

	@Override
	public boolean deletePayee(Payee payee) {
		entityManager.remove(payee);
		return true;
	}

	@Override
	public boolean updatePayee(Payee payee) {
		entityManager.merge(payee);
		return true;
	}

	@Override
	public Payee findById(int id) {
		Query query = entityManager.createQuery("from Payee where payeeId = ?1");
		query.setParameter(1, id);
		return (Payee) query.getSingleResult();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Payee> findAll() {
		Query query = entityManager.createQuery("from Payee");
		return query.getResultList();
	}

}
