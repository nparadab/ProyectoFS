package cl.proyecto.mascotas.boleta.service;

import java.util.List;

import cl.proyecto.mascotas.model.Boleta;
import cl.proyecto.mascotas.model.dto.BoletaDTO;
import cl.proyecto.mascotas.model.response.BoletaResponse;



public interface IBoletaService {

    BoletaResponse listarBoletaByKey(Integer idBoleta);

    List<Boleta> listarBoletaAll();

    Boleta crearBoleta(BoletaDTO boletaObj);

    Boleta actualizarBoleta(Integer numboleta, BoletaDTO boletaObj);

    boolean borrarBoletaByKey(Integer idBoleta);

    boolean desactivarBoleta(Integer idBoleta);

    List<Boleta> listarBoletasActivas();


  

   

}
