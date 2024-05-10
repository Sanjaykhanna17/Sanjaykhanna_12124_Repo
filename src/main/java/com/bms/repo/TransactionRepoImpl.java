package com.bms.repo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bms.entity.Payee;
import com.bms.entity.Transaction;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class TransactionRepoImpl implements TransactionRepo {
	
	@Autowired
	private EntityManager entityManager;

	@Override
	public void deleteByPayee(Payee payee) {
		Query query = entityManager.createQuery("delete from Transaction where payee.payeeId = ?1");
		query.setParameter(1, payee.getPayeeId());
		query.executeUpdate();
	}

	@Override
	public void addTransaction(Transaction transaction) {
		entityManager.persist(transaction);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Transaction> findAllTransaction() {
		Query query = entityManager.createQuery("from Transaction");
		return query.getResultList();
	}

}
