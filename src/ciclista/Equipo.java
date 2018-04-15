
package ciclista;

import java.lang.reflect.Array;


public class Equipo {
    String nombre, capitan, pruebas;
    int kilometros, puesto;

    public Equipo(String nombre, String capitan, String pruebas, int kilometros, int puesto) {
        this.nombre = nombre;
        this.capitan = capitan;
        this.pruebas = pruebas;
        this.kilometros = kilometros;
        this.puesto = puesto;        
    }

    Equipo() { 
    }

    public String getNombre(){
        return nombre;
    }
    public void setNombre(){
        this.nombre=nombre;
    }
    public String getCapitan(){
        return capitan;
    }
    public void setCapitan(){
        this.capitan=capitan;
    }
    public String getPruebas(){
        return pruebas;
    }
    public void setPruebas(){
        this.pruebas=pruebas;
    }
    public int getKilometros(){
        return kilometros;
    }
    public void setKilometros(){
        this.kilometros=kilometros;
    }
    public int getPuesto(){
        return puesto;
    }
    public void setPuesto(){
        this.puesto=puesto;
    }
    
    
}
