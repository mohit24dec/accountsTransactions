package com.mohit.accounts.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mohit.accounts.entities.Accounts;

public interface AccountsRepository extends JpaRepository<Accounts, Integer> {

}
