/*UNIVERSIDAD TECNOLOGICA DE HONDURAS 
// ALUMNO: Delmer Avilez.
//CUENTA: 201930110175
/**
 *
 * @author JOSE EDUARDO
 */
package ec.futlbol.control;
    import javax.faces.bean.ManagedBean;
    import javax.faces.bean.SessionScoped;
    import ec.futbol.rnegocio.funciones.*;
    import ec.futbol.rnegocio.clases.*;
    import java. util.*;
    import javax.faces.cotext.facesContext;;

public class EQUIPOII {
    private List<EQUIPOII> lista;
    private EQUIPOII EQUISel;
    private EQUIPOII EQUISelNew;
    /**
     * @param args the command line arguments
     */
    public EQUIPOII(){
        lista=EQUIPOII.Obtener();
        EQUISelNew = new EQUIPOII ();    
} 
    public String cargarEQUIPOII(){
        Map requestMap = FacesContext.getCurrentInstance();
        getExternalContext().getRequeastParameterMap();
        String customer=(String)requestMap.get("EQUIPOII");
        EQUISel= EQUIPOII.obtener(Integer.parseInt(customer));
        return "EQIPOIIINFO";
    }
    public String insertar(){
        EQUISelNew.setPais(new Pais(2,"España"));
        EQUISelNew.setClub (new Club (2,"Madrid", "Madrid"));
        EQUIPOII.insertar(EQUISelNew);
        return "EQUIPOII?transition=slide";  
    }
    public String insertar(){
         
         
     }
public EQUIPOII getEQUISel(){
    return EQUISel;
}
    

    
    
    
}
