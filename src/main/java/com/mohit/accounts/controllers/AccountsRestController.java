package com.mohit.accounts.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mohit.accounts.entities.AccountTransactions;
import com.mohit.accounts.entities.Accounts;
import com.mohit.accounts.repositories.AccountTransactionsRepository;
import com.mohit.accounts.repositories.AccountsRepository;

@RestController
public class AccountsRestController {
	
	@Autowired
	AccountsRepository accountsRepository;
	
	@Autowired
	AccountTransactionsRepository accountTransactionsRepository;
	
	@RequestMapping(value="/accounts",method = RequestMethod.GET)
	public List<Accounts> findFlights(){
		
		return accountsRepository.findAll();
			
	}
	
	@RequestMapping(value="/accounts/{accountNumber}", method = RequestMethod.GET)
	public List<AccountTransactions> findReservation(@PathVariable("accountNumber") int accountNumber) {
		return accountTransactionsRepository.findTransactions(accountNumber);
	}
}
