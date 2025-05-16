package cl.proyecto.mascotas.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="detalle_boleta")
@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@IdClass(value=DetalleBoletaKey.class)
public class DetalleBoleta {
    

    @Id
    @Column(name="ID_BOLETA")
    private Integer idBoleta;
    @Id
    @Column(name="ID_PRODUCTO")
    private Integer idProducto;
    @Column(name="CANTIDAD")
    private Integer cantidad;
    @Column(name="PRECIO_UNITARIO")
    private Integer precioUni;
    @Column(name="SUBTOTAL")
    private Integer subTotal;


}
