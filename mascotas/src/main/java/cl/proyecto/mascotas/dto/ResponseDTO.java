package cl.proyecto.mascotas.dto;

import java.util.List;
import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Data; 
import lombok.Getter;
import lombok.Setter;



@Data
@AllArgsConstructor
@Getter
@Setter
        
public class ResponseDTO {

    private boolean ok;
	private String status;
	private String detalle;
    private int count ;
    private List<?> registros;
    private Object error;



    public ResponseDTO(String detalle,List<?> registros){
        if (registros== null) count=0;
        else  count=registros.size(); 
        ok = true;    
        status = "OKE-0000"; 
        this.detalle=detalle;  
        this.registros = registros; 
        this.error= null;
    }




    public ResponseDTO(String detalle,boolean respuesta){
        count=0;  
        ok=respuesta;  
        status="OKE-000";    
        this.detalle=detalle;  
        this.registros=null;   
        this.error= null;
    }

       
        public ResponseDTO(String codigo,String detalle,Map<String, Object> error){
            count=0;   
            ok=false;  
            status=codigo;    
            this.detalle=detalle;  
            this.error=error  ;  
            this.registros=null;   
            
        }


}
