package com.mindfire.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mindfire.model.Bank;

public interface BankRepository extends JpaRepository<Bank,Integer> {

}
