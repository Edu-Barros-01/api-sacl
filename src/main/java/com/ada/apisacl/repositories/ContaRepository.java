package com.ada.apisacl.repositories;

import com.ada.apisacl.entities.Conta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContaRepository extends JpaRepository<Conta, Integer> {
}