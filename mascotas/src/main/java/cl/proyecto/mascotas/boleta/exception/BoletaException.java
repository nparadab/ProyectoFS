package cl.proyecto.mascotas.boleta.exception;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice   
public class BoletaException {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Map<String, String> handlerInvalidArguments(MethodArgumentNotValidException  exception){
        Map<String, String> errors = new HashMap<>();

        exception.getBindingResult().getFieldErrors().forEach(error -> {
            errors.put(error.getField(),error.getDefaultMessage());

            });

            return errors;
        };



        
    }





