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
@Table(name="producto")
@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Producto {

    @Id
    @Column(name="ID_PRODUCTO")
    private Integer idProducto;
    @Column(name="NOMBRE")
    private String nombre;
    @Column(name="DESCRIPCION")
    private String descripcion;
    @Column(name="PRECIO")
    private Integer precio;
    @Column(name="ID_CATEGORIA")
    private Integer idCategoria;
    @Column(name="ACTIVO")
    private Integer activo;

}
