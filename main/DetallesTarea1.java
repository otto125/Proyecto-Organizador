
package main;

/**
 *
 * @author 50242
 */
public class DetallesTarea1 {
    private String DetallesTareas;

    public DetallesTarea1(String DetallesTareas) {
        this.DetallesTareas = DetallesTareas;
    }

    public String getDetallesTareas() {
        return DetallesTareas;
    }

    public void setDetallesTareas(String DetallesTareas) {
        this.DetallesTareas = DetallesTareas;
    }
    
    public Object[] toArray(){
        Object[] obj = new Object[1];

        obj[0] = DetallesTareas;
        
        return obj;
    }
    
}
