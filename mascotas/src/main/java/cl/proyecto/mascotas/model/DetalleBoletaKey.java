package cl.proyecto.mascotas.model;

import java.io.Serializable;
import java.util.Objects;

public class DetalleBoletaKey implements Serializable{


    private Integer idBoleta;
    private Integer idProducto;

    
    public DetalleBoletaKey() {
    }


    public DetalleBoletaKey(Integer idBoleta, Integer idProducto) {
        this.idBoleta = idBoleta;
        this.idProducto = idProducto;
    }


    public Integer getIdBoleta() {
        return idBoleta;
    }


    public void setIdBoleta(Integer idBoleta) {
        this.idBoleta = idBoleta;
    }


    public Integer getIdProducto() {
        return idProducto;
    }


    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }


    public boolean equals(Object obj){
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        final DetalleBoletaKey aux = (DetalleBoletaKey) obj;
        if (!Objects.equals(this.idBoleta,aux.idBoleta)){          return false;        }        if (!Objects.equals(this.idProducto,aux.idProducto)){          return false;        }
        return true;
    }

    public int hashCode() {
        int hash=7;
        hash = 59* hash +  Objects.hashCode(this.idBoleta);        hash = 59* hash +  Objects.hashCode(this.idProducto);
        return hash;
    }

}
