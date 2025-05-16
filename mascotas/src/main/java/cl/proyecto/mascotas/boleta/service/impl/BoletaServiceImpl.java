package cl.proyecto.mascotas.boleta.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.proyecto.mascotas.boleta.repository.BoletaRepository;
import cl.proyecto.mascotas.boleta.repository.ClienteRepository;
import cl.proyecto.mascotas.boleta.repository.DetalleBoletaRepository;
import cl.proyecto.mascotas.boleta.repository.ProductoRepository;
import cl.proyecto.mascotas.boleta.service.IBoletaService;
import cl.proyecto.mascotas.model.Boleta;
import cl.proyecto.mascotas.model.dto.BoletaDTO;
import cl.proyecto.mascotas.model.response.BoletaResponse;


import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;




@Service
public class BoletaServiceImpl implements IBoletaService {



        private static final Logger logger = LoggerFactory.getLogger(BoletaServiceImpl.class);

   
    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    BoletaRepository repositoryBoleta;
    @Autowired
    ClienteRepository repositoryCliente;
    @Autowired
    DetalleBoletaRepository repositoryDetalleBoleta;
    @Autowired
    ProductoRepository repositoryProducto;






    @Override
    public BoletaResponse listarBoletaByKey(Integer idBoleta) {
        logger.info("Servicio Impl Buscar por ID: {}", idBoleta);

        Optional<Boleta> boletaOpt = repositoryBoleta.findById(idBoleta);
    
        if (boletaOpt.isPresent()) {
         
            return modelMapper.map(boletaOpt.get(), BoletaResponse.class);
        } else {
            return null;
        }
    }

    @Override
    public List<Boleta> listarBoletaAll() {
        logger.info("Servicio Impl Listar");

        return (List<Boleta>) repositoryBoleta.findAll();
    }

    @Override
    public Boleta crearBoleta(BoletaDTO boletaObj) {
        logger.info("Servicio Impl Crear");

        Boleta aux = modelMapper.map(boletaObj, Boleta.class);
        return repositoryBoleta.save(aux);
    }

    @Override
    public Boleta actualizarBoleta(Integer numboleta, BoletaDTO boletaObj) {
        logger.info("Servicio Impl Actualizar");

        Boleta aux = modelMapper.map(boletaObj, Boleta.class);
        return repositoryBoleta.save(aux);
    }

    @Override
    public boolean borrarBoletaByKey(Integer idBoleta) {
       logger.info("Servicio Impl Borrar");
       repositoryBoleta.deleteById(idBoleta);
       return true;
    }



    @Override
    public boolean desactivarBoleta(Integer idBoleta) {
        logger.info("Servicio Impl Desactivar Boleta: {}", idBoleta);

        Optional<Boleta> boletaOptional = repositoryBoleta.findById(idBoleta);

        if (boletaOptional.isPresent()) {
            Boleta boleta = boletaOptional.get();
            boleta.setEstado("desactivada"); 
            repositoryBoleta.save(boleta);
            return true;
        } else {
            logger.warn("No se encontró la boleta con ID: {}", idBoleta); 
            return false; 
        }
    }



    @Override
    public List<Boleta> listarBoletasActivas() {
    logger.info("Servicio Impl Listar Boletas Activas");
    return repositoryBoleta.findByEstadoNot("desactivada");
}










}
