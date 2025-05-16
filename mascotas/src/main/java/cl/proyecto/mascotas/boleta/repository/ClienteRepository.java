package cl.proyecto.mascotas.boleta.repository;

import org.springframework.data.repository.CrudRepository;

import cl.proyecto.mascotas.model.Cliente;

public interface ClienteRepository extends CrudRepository <Cliente , String>{


    Iterable<Cliente> findByIdCliente(String idCliente);

}
