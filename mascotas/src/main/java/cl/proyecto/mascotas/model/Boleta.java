package cl.proyecto.mascotas.model;

import java.sql.Date;

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
@Table(name="boleta")
@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Boleta {

    @Id
    @Column(name="ID_BOLETA")
    private Integer idBoleta;
    @Column(name="ID_PEDIDO")
    private Integer idPedido;
    @Column(name="FECHA_EMISION")
    private Date fechaEmision;
    @Column(name="TOTAL")
    private Integer total;
    @Column(name="RUT_CLIENTE")
    private String rutCliente;
    @Column(name="ESTADO")
    private String estado;
    @Column(name="METODO_PAGO")
    private String metodoPago;





}
