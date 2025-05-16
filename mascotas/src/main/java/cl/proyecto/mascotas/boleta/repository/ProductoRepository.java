package cl.proyecto.mascotas.boleta.repository;

import org.springframework.data.repository.CrudRepository;

import cl.proyecto.mascotas.model.Producto;

public interface ProductoRepository extends CrudRepository<Producto , Integer>{


    Iterable<Producto> findByIdProducto(Integer idProducto);

}
