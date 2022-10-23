
package main;

import java.util.ArrayList;

/**
 *
 * @author 50242
 */
public class ListaTareasclass {
    
    private String ListaTarea;

    public ListaTareasclass(String ListaTarea) {
        this.ListaTarea = ListaTarea;
    }

    public String getListaTarea() {
        return ListaTarea;
    }

    public void setListaTarea(String ListaTarea) {
        this.ListaTarea = ListaTarea;
    }
    
    
    
     public Object[] toArray(){
        Object[] obj = new Object[1];

        obj[0] = ListaTarea;
        
        return obj;
    }
    
    
    
    
}
