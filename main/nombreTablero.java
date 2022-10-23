
package main;

/**
 *
 * @author 50242
 */
public class nombreTablero {
   private String nombre;

    public nombreTablero(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
     public Object[] toArray(){
        Object[] obj = new Object[1];

        obj[0] = nombre;
        
        return obj;
    }
    

    
     
    
}
