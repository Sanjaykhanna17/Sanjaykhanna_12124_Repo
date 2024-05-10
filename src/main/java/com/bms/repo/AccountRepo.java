package com.bms.repo;

import com.bms.entity.Account;
import com.bms.entity.Role;

public interface AccountRepo {

	public Account findByRole(Role role);

	public boolean addAccount(Account account);

	public boolean deleteAccount(Account account);

	public boolean updateAccount(Account account);

	public Account findByAccountNumber(long l);
}
