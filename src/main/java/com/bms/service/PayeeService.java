package com.bms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bms.entity.Account;
import com.bms.entity.Payee;
import com.bms.entity.Role;
import com.bms.repo.AccountRepo;
import com.bms.repo.PayeeRepo;

@Service
public class PayeeService {

	@Autowired
	private PayeeRepo payeeRepo;
	@Autowired
	private AccountRepo accountRepo;

	public String addPayee(Payee payee) {
		String msg = "";
		try {
			Account account = payee.getAccount();
			account.setRole(Role.PAYEE);
			accountRepo.addAccount(account);
			payee.setAccount(accountRepo.findByAccountNumber(account.getAccountNumber()));
			payeeRepo.addPayee(payee);
			msg = "success";
		} catch (Exception e) {

			msg = "Failed to add Payee";
		}

		return msg;
	}

	public String deletePayee(int payeeId) {
		String msg = "";

		try {
			Payee payee = payeeRepo.findById(payeeId);
			payeeRepo.deletePayee(payee);
			accountRepo.deleteAccount(payee.getAccount());
			;
			msg = "success";
		} catch (Exception e) {

			msg = "Failed to delete Payee";
		}

		return msg;
	}

	public String updatePayee(Payee payee) {
		String msg = "";

		try {
			accountRepo.updateAccount(payee.getAccount());
			payeeRepo.updatePayee(payee);
			msg = "success";
		} catch (Exception e) {

			msg = "Failed to update Payee";
		}

		return msg;
	}

	public List<Payee> getPayeeList() {
		return payeeRepo.findAll();
	}

	public Payee getPayee(int payeeId) {
		return payeeRepo.findById(payeeId);
	}

}
