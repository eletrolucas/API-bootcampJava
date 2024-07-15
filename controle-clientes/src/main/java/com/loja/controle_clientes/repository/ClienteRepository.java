package com.loja.controle_clientes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.loja.controle_clientes.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
