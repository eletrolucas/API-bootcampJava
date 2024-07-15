package com.loja.controle_clientes.service;

import com.loja.controle_clientes.model.Cliente;
import com.loja.controle_clientes.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;

public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public List<Cliente> getAllclientes() {
        return clienteRepository.findAll();
    }

    public Cliente getclienteById(Long id) {
        return clienteRepository.findById(id).orElse(null);
    }

    public Cliente savecliente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    public void deletecliente(Long id) {
        clienteRepository.deleteById(id);
    }

}
