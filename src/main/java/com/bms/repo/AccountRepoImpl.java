package com.bms.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bms.entity.Account;
import com.bms.entity.Role;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class AccountRepoImpl implements AccountRepo {
	
	@Autowired
	private EntityManager entityManager;

	@Override
	public Account findByRole(Role role) {
		Query query = entityManager.createQuery("from Account where role = ?1");
		query.setParameter(1, role);
		return (Account) query.getSingleResult();
	}

	@Override
	public boolean addAccount(Account account) {
		entityManager.persist(account);
		return true;
		
	}

	@Override
	public boolean deleteAccount(Account account) {
		entityManager.remove(account);
		return true;
	}

	@Override
	public boolean updateAccount(Account account) {
		entityManager.merge(account);
		return true;
	}

	@Override
	public Account findByAccountNumber(long id) {
		Query query = entityManager.createQuery("from Account where accountNumber = ?1");
		query.setParameter(1, id);
		return (Account) query.getSingleResult();
	}

}
