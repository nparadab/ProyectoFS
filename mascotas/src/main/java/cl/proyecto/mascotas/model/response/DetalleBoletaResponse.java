package cl.proyecto.mascotas.model.response;

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
public class DetalleBoletaResponse {


    
    private Integer idBoleta;
    private Integer idProducto;
    private Integer cantidad;
    private Integer precioUni;
    private Integer subTotal;
    ProductoResponse producto;
    BoletaResponse boleta;




}
