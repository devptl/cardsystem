package com.mindfire.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mindfire.model.Account;

public interface AccountRepository extends JpaRepository<Account,Integer>{

}
