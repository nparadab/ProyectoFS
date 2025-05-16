package cl.proyecto.mascotas.model.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


import jakarta.validation.constraints.Email;
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
public class ClienteDTO {



    @NotBlank(message = "RUT_CLIENTE es Obligatorio")
    private String rutCliente;
    @NotBlank(message = "NOMBRE es Obligatorio")
    private String nombre;
    @NotBlank(message = "APELLIDO es Obligatorio")
    private String apellido;
    @Email(message = "Email debe ser valido")
    private String correo;
    @NotBlank(message = "DIRECCION es Obligatorio")
    private String direccion;
    @NotNull(message = "TELEFONO es Obligatorio")
    private String telefono;
    @NotBlank(message = "ESTADO es Obligatorio")
    private Integer estado;


}
