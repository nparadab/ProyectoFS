package cl.proyecto.mascotas.model.response;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProductoResponse {


    
    private Integer idProducto; 
    private String nombre;
    private String descripcion;
    private Integer precio;
    private Integer idCategoria;
    private Integer activo;
    List<DetalleBoletaResponse> listDetalleBoleta = new ArrayList<>();
    
    



}
