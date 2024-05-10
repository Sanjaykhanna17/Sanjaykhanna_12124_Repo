package com.bms.repo;


import java.util.List;

import com.bms.entity.Payee;

public interface PayeeRepo {
	
	public boolean addPayee(Payee payee);
	public boolean deletePayee(Payee payee);
	public boolean updatePayee(Payee payee);
	public Payee findById(int id);
	public List<Payee> findAll();

}
