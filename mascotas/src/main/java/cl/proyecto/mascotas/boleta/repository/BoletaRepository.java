package cl.proyecto.mascotas.boleta.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import cl.proyecto.mascotas.model.Boleta;



public interface BoletaRepository extends CrudRepository<Boleta , Integer>{


    

    Iterable<Boleta> findByIdBoleta(Integer idBoleta);
    List<Boleta> findByEstadoNot(String estado);





}
