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
public class ClienteResponse {



    
    private String rutCliente;
    private String nombre;
    private String apellido;
    private String correo;
    private String direccion;
    private String telefono;
    private Integer estado;
    List<BoletaResponse> listBoleta = new ArrayList<>();

    

}
