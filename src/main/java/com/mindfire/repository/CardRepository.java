package com.mindfire.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mindfire.model.Card;

public interface CardRepository extends JpaRepository<Card,String>{

}
