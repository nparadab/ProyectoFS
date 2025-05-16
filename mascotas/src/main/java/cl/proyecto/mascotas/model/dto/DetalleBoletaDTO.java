package cl.proyecto.mascotas.model.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

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
public class DetalleBoletaDTO {

    @NotNull(message = "IdBoleta es Obligatorio")
    private Integer idBoleta;
    @NotNull(message = "IdProducto es Obligatorio")
    private Integer idProducto;
    @NotNull(message = "Cantidad es Obligatorio")
    private Integer cantidad;
    @NotNull(message = "PrecioUnitario es Obligatorio")
    private Integer precioUni;
    @NotNull(message = "Subtotal es Obligatorio")
    private Integer subTotal;




}
