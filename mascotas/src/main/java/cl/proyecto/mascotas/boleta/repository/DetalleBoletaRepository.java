package cl.proyecto.mascotas.boleta.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import cl.proyecto.mascotas.model.DetalleBoleta;
import cl.proyecto.mascotas.model.DetalleBoletaKey;

public interface DetalleBoletaRepository extends CrudRepository<DetalleBoleta , DetalleBoletaKey>{

    List<DetalleBoleta> findByIdBoleta(Integer idBoleta);
    Iterable<DetalleBoleta> findByIdProducto(Integer idProducto);

}
