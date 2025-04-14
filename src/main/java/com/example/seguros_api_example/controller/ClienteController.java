package com.example.seguros_api_example.controller;

import com.example.seguros_api_example.dto.ClienteDTO;
import com.example.seguros_api_example.entity.Cliente;
import com.example.seguros_api_example.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping(path = "/all")
    public List<ClienteDTO> obtenerClientes() {

        return clienteService.obtenerTodos();
    }

    @GetMapping(path = "/NombreAndEmail")
    public List<ClienteDTO> findByNombreAndEmail() {
        return clienteService.findByNombreAndEmail("Jeferson", "jeferson@gmail.com");
    }

    @PostMapping(path = "/add")
    public Cliente guardarCliente(@RequestBody Cliente cliente) {

        return clienteService.guardar(cliente);
    }

    @GetMapping("/{id}")
    public Cliente obtenerPorId(@PathVariable Long id) {

        return clienteService.obtenerPorId(id);
    }

    @DeleteMapping("/{id}")
    public void eliminarCliente(@PathVariable Long id) {

        clienteService.eliminar(id);
    }

    @PutMapping
    public Cliente actualizarCliente(@RequestBody Cliente cliente) {

        return clienteService.actualizar(cliente);
    }
}

