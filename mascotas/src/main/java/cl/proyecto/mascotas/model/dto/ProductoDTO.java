package cl.proyecto.mascotas.model.dto;

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
public class ProductoDTO {

    @NotNull(message = "ID_PRODUCTO es Obligatorio")
    private Integer idProducto;
    @NotBlank(message = "NOMBRE es Obligatorio")
    private String nombre;
    @NotBlank(message = "DESCRIPCION es Obligatorio")
    private String descripcion;
    @NotNull(message = "PRECIO es Obligatorio")
    private Integer precio;
    @NotNull(message = "ID_CAEGORIA es Obligatorio")
    private Integer idCategoria;
    @NotNull(message = "ACTIVO es Obligatorio")
    private Integer activo;

    



}
