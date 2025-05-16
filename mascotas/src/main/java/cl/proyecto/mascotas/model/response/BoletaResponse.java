package cl.proyecto.mascotas.model.response;

import java.sql.Date;
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
public class BoletaResponse {

    private Integer idBoleta;
    private Integer idPedido;
    private Date fechaEmision;
    private Integer total;
    private String rutCliente;
    private String estado;
    private String metodoPago;
    List<DetalleBoletaResponse> listDetalleBoleta = new ArrayList<>();
    ClienteResponse cliente;


}
