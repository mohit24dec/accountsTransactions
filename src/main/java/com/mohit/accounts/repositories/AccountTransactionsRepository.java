package com.mohit.accounts.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.mohit.accounts.entities.AccountTransactions;

public interface AccountTransactionsRepository extends JpaRepository<AccountTransactions, Integer> {
	
	@Query("from AccountTransactions where accountNumber=:accnum")
	List<AccountTransactions> findTransactions(@Param("accnum") int accountNumber);
		
}
