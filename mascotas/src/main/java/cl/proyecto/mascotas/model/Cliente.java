package cl.proyecto.mascotas.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="cliente")
@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Cliente {

    @Id
    @Column(name="RUT_CLIENTE")
    private String idCliente;
    @Column(name="NOMBRE")
    private String nombre;
    @Column(name="Apellido")
    private String apellido;
    @Column(name="CORREO_ELECTRONICO")
    private String correo;
    @Column(name="DIRECCION")
    private String direccion;
    @Column(name="TELEFONO")
    private String telefono;
    @Column(name="ESTADO")
    private Integer estado;


}
