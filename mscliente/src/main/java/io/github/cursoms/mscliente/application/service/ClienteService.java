package io.github.cursoms.mscliente.application.service;

import io.github.cursoms.mscliente.domain.Cliente;
import io.github.cursoms.mscliente.infra.repository.ClienteRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.beans.Transient;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ClienteService {

    private  final ClienteRepository repository;

    @Transactional
    public Cliente save(Cliente cliente){
        return  repository.save(cliente);
    }

    public Optional<Cliente>  getByCPF(String cpf){
        return repository.findByCpf(cpf);
    }
}
