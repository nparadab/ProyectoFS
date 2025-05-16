package cl.proyecto.mascotas.model.dto;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BoletaDTO {

    @NotNull(message = "ID_BOLETA es Obligatorio")
    private Integer idBoleta;
    @NotNull(message = "ID_PEDIDO es Obligatorio")
    private Integer idPedido;
    private Date fechaEmision;
    @NotNull(message = "TOTAL es Obligatorio")
    private Integer total;
    @NotBlank(message = "RUT_CLIENTE es Obligatorio")
    private String rutCliente;
    @NotBlank(message = "ESTADO es Obligatorio")
    private String estado;
    @NotBlank(message = "METODO_PAGO es Obligatorio")
    private String metodoPago;

}
