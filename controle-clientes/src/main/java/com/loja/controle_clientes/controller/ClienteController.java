package com.loja.controle_clientes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import com.loja.controle_clientes.model.Cliente;
import com.loja.controle_clientes.service.ClienteService;

@RestController
@RequestMapping("/api/cliente")
public class ClienteController {
    @Autowired
    private ClienteService clienteService;

    @GetMapping
    public List<Cliente> getAllClientes() {
        return clienteService.getAllclientes();
    }

    @GetMapping("/{id}")
    public Cliente getClienteById(@PathVariable Long id) {
        return clienteService.getclienteById(id);
    }

    @PostMapping
    public Cliente createCliente(@RequestBody Cliente Cliente) {
        return clienteService.savecliente(Cliente);
    }

    @PutMapping("/{id}")
    public Cliente updateCliente(@PathVariable Long id, @RequestBody Cliente Cliente) {
        Cliente.setId(id);
        return clienteService.savecliente(Cliente);
    }

    @DeleteMapping("/{id}")
    public void deleteCliente(@PathVariable Long id) {
        clienteService.deletecliente(id);
    }
}
