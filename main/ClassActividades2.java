
package main;

/**
 *
 * @author 50242
 */
public class ClassActividades2 {
    
    private String NombreActiviades;

    public ClassActividades2(String NombreActiviades) {
        this.NombreActiviades = NombreActiviades;
    }

    public String getNombreActiviades() {
        return NombreActiviades;
    }

    public void setNombreActiviades(String NombreActiviades) {
        this.NombreActiviades = NombreActiviades;
    }
    
    public Object[] toArray(){
        Object[] obj = new Object[1];

        obj[0] = NombreActiviades;
        
        return obj;
    }
    
    
    
    
}
