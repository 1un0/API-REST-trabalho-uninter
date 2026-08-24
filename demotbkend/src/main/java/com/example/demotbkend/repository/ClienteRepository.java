package com.example.demotbkend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demotbkend.model.Cliente;


@Repository
public interface ClienteRepository  extends JpaRepository <Cliente, Long>{

}
