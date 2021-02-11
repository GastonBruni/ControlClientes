package com.mycompany.servicio;

import java.util.List;
import com.mycompany.domain.Persona;

public interface PersonaService {
    
    public List<Persona> lstPersonas();
    
    public void guardar(Persona persona);
    
    public void eliminar(Persona persona);
    
    public Persona encontrarPersona(Persona persona);
    
}
