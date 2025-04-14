package com.example.seguros_api_example.service;

import com.example.seguros_api_example.dto.ClienteDTO;
import com.example.seguros_api_example.entity.Cliente;
import com.example.seguros_api_example.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public List<ClienteDTO> findByNombreAndEmail(String nombre, String email) {
        List<Cliente> clienteList = clienteRepository.findByNombreAndEmail(nombre, email);

        List<ClienteDTO> clienteDTO = new ArrayList<>();

        for (Cliente cliente : clienteList) {
            ClienteDTO client = new ClienteDTO();
            client.setNombre(cliente.getNombre());
            client.setEmail(cliente.getEmail());
            client.setTelefono(cliente.getTelefono());
            clienteDTO.add(client);
        }
        return clienteDTO;
    }

    public List<ClienteDTO> obtenerTodos() {

        List<Cliente> clientList = clienteRepository.findAll();

        List<ClienteDTO> clienteDTO = new ArrayList<>();

        for (Cliente cliente : clientList) {
            ClienteDTO client = new ClienteDTO();
            client.setTelefono(cliente.getTelefono());
            client.setEmail(cliente.getEmail());
            client.setNombre(cliente.getNombre());
            clienteDTO.add(client);
        }

        return clienteDTO;
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
