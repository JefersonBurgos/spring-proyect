package com.example.seguros_api_example.service;

import com.example.seguros_api_example.entity.Cliente;
import com.example.seguros_api_example.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public List<Cliente> findByNombreAndEmail(String nombre, String email){
        return clienteRepository.findByNombreAndEmail(nombre,email);
    }

    public List<Cliente> obtenerTodos() {
        return clienteRepository.findAll();
    }

    public Cliente guardar(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    public Cliente actualizar(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    public Cliente obtenerPorId(Long id) {
        return clienteRepository.findById(id).orElse(null);
    }

    public void eliminar(Long id) {
        clienteRepository.deleteById(id);
    }
}
