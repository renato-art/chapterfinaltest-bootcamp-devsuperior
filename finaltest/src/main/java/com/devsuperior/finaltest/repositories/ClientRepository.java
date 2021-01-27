package com.devsuperior.finaltest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.finaltest.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}
