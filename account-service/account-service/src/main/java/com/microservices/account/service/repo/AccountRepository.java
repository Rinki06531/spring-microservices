package com.microservices.account.service.repo;

import com.microservices.account.service.model.Accounts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Entity;
import javax.persistence.Table;

@Repository
public interface AccountRepository extends JpaRepository<Accounts, Integer> {
}
