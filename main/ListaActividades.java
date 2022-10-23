
package main;

/**
 *
 * @author 50242
 */
public class ListaActividades {
    private String ListaActividades; 
    public String ActividadesPorcentaje;
    

    public ListaActividades(String ListaActividades) {
        this.ListaActividades = ListaActividades;
    }

    public String getActividadesPorcentaje() {
        return ActividadesPorcentaje;
    }

    public void setActividadesPorcentaje(String ActividadesPorcentaje) {
        this.ActividadesPorcentaje = ActividadesPorcentaje;
    }

    public String getListaActividades() {
        return ListaActividades;
    }

    public void setListaActividades(String ListaActividades) {
        this.ListaActividades = ListaActividades;
    }
    
    public Object[] toArray(){
        Object[] obj = new Object[1];

        obj[0] = ListaActividades;
        
        return obj;
    }
    
    
}
