package cl.proyecto.mascotas.boleta.controller;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cl.proyecto.mascotas.boleta.service.IBoletaService;
import cl.proyecto.mascotas.dto.ResponseDTO;
import cl.proyecto.mascotas.model.Boleta;
import cl.proyecto.mascotas.model.dto.BoletaDTO;
import cl.proyecto.mascotas.model.response.BoletaResponse;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;

@RestController
@RequestMapping("/api/crud/boleta")
public class BoletaController {

    private static final Logger logger = LoggerFactory.getLogger(BoletaController.class);

    @Autowired
    IBoletaService boletaService;

    @Autowired
    private ModelMapper modelMapper;

    @GetMapping("/{idBoleta}")
    public ResponseEntity<ResponseDTO> getBoletaByKey(@PathVariable @Min(1) Integer idBoleta) {
        logger.info("Get Boleta By Key: {}", idBoleta);
        BoletaResponse objResponse = boletaService.listarBoletaByKey(idBoleta);
        List<BoletaResponse> listObjeto = new ArrayList<>();
        listObjeto.add(objResponse);
        return new ResponseEntity<>(new ResponseDTO("Busqueda By ID", listObjeto), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<ResponseDTO> getAllBoleta() {
        logger.info("Get All Boletas");
        List<Boleta> boletas = boletaService.listarBoletaAll();
        List<BoletaResponse> boletaResponses = new ArrayList<>();
        for (Boleta boleta : boletas) {
            boletaResponses.add(modelMapper.map(boleta, BoletaResponse.class));
        }
        return new ResponseEntity<>(new ResponseDTO("Ok Registros enviados", boletaResponses), HttpStatus.OK);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<ResponseDTO> createBoleta(@Valid @RequestBody BoletaDTO boletaObj) {
        logger.info("Crear Boleta");
        Boleta obj = boletaService.crearBoleta(boletaObj);
        BoletaResponse response = modelMapper.map(obj, BoletaResponse.class);
        List<BoletaResponse> aux = new ArrayList<>();
        aux.add(response);
        return new ResponseEntity<>(new ResponseDTO("Agregar Registro", aux), HttpStatus.CREATED);
    }

    @PutMapping("/{idBoleta}")
    public ResponseEntity<ResponseDTO> updateBoleta(@PathVariable @Min(1) Integer idBoleta, @Valid @RequestBody BoletaDTO boletaObj) {
        logger.info("Actualizar Boleta con ID: {}", idBoleta);
        Boleta obj = boletaService.actualizarBoleta(idBoleta, boletaObj);
        BoletaResponse response = modelMapper.map(obj, BoletaResponse.class);
        List<BoletaResponse> aux = new ArrayList<>();
        aux.add(response);
        return new ResponseEntity<>(new ResponseDTO("Actualizar Registro", aux), HttpStatus.OK);
    }

    @DeleteMapping("/{idBoleta}")
    public ResponseEntity<ResponseDTO> deleteBoleta(@PathVariable @Min(1) Integer idBoleta) {
        logger.info("Borrar Boleta con ID: {}", idBoleta);
        boolean resultado = boletaService.borrarBoletaByKey(idBoleta);
        return new ResponseEntity<>(new ResponseDTO("Boleta Borrada", resultado), HttpStatus.OK);
    }

    @PutMapping("/desactivar/{idBoleta}")
    public ResponseEntity<ResponseDTO> desactivarBoleta(@PathVariable @Min(1) Integer idBoleta) {
        logger.info("Desactivar Boleta con ID: {}", idBoleta);
        boolean resultado = boletaService.desactivarBoleta(idBoleta);
        if (resultado) {
            return new ResponseEntity<>(new ResponseDTO("Boleta Desactivada", true), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(new ResponseDTO("No se pudo desactivar la boleta", false), HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/activas")
    public ResponseEntity<ResponseDTO> getBoletasActivas() {
        logger.info("Obtener boletas activas");
        List<Boleta> activas = boletaService.listarBoletasActivas();
        List<BoletaResponse> boletaResponses = new ArrayList<>();
        for (Boleta boleta : activas) {
            boletaResponses.add(modelMapper.map(boleta, BoletaResponse.class));
        }
        return new ResponseEntity<>(new ResponseDTO("Boletas activas", boletaResponses), HttpStatus.OK);
    }
}