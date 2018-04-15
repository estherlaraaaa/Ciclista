
package ciclista;


public class Ciclista {

    String nombre, nacionalidad, pruebas, Id;
    int anhio, nacimiento;

    public Ciclista() {
    }

    public Ciclista(String nombre, String nacionalidad, String pruebas, String Id, int anhio, int nacimiento) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.pruebas = pruebas;
        this.Id = Id;
        this.anhio = anhio;
        this.nacimiento = nacimiento;
        
    }
    
    public String getNombre(){
        return nombre;
    }
    public void setNombre(){
        this.nombre=nombre;
    }
    public String getNacionalidad(String nacionalidad){
        return nacionalidad;
    }
    public void setNacionalidad(){
        this.nacionalidad=nacionalidad;
    }
    public String getPruebas(){
        return pruebas;
    }
    public void setPruebas(){
        this.pruebas=pruebas;
    }
    public String getId(){
        return Id;
    }
    public void setId(){
        this.Id=Id;
    }
    public int getAnhio(){
        return anhio;
    }
    public void setAnhio(){
        this.anhio=anhio;
    }
    public int getNacimiento(){
        return nacimiento;
    }
    public void setNacimiento(){
        this.nacimiento=nacimiento;
    }
    
    public static void main(String[] args) {
        Equipo e=new Equipo();
        
    }
    
}
