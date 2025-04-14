package com.example.seguros_api_example.service;

import com.example.seguros_api_example.dto.ClienteDTO;
import com.example.seguros_api_example.entity.Cliente;
import com.example.seguros_api_example.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public interface ClienteService {

    List<ClienteDTO> findByNombreAndEmail(String nombre, String email);

    List<ClienteDTO> obtenerTodos();

    Cliente guardar(Cliente cliente);

    Cliente actualizar(Cliente cliente);

    Cliente obtenerPorId(Long id);

    void eliminar(Long id);
}
