package com.example.demotbkend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demotbkend.model.Pedido;


@Repository
public interface PedidoRepository  extends JpaRepository <Pedido, Long>{

}
