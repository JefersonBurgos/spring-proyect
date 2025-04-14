package com.example.seguros_api_example.repository;

import com.example.seguros_api_example.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.NativeQuery;

import java.util.List;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    List<Cliente> findByNombreAndEmail(String nombre, String email);
}
