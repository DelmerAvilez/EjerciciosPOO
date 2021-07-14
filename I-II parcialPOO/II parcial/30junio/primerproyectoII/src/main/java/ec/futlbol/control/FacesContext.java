/*UNIVERSIDAD TECNOLOGICA DE HONDURAS
//ALUMNO: Delmer Avilez
//CUENTA: 201930110175
 
 */
package ec.futlbol.control;
 

/**
 *
 * @author JOSE EDUARDO
 */
class FacesContext {
    public static List<EQUIPOII> obtener(){
        ArrayList<EQUIPOII>lst= new ArrayList<>();
        String sql="selec id_equipo. id club, nombre, posicion, sexo, pais from EQUIPOII";
        try{
            ConjuntoResultado cres= AccesoDatos.ejecutaQuery(sql);
            EQUIPOII EQUI;
            while (cres.next()){
                EQUI= new EQUIPOII();
                EQUI.setId_EQUIPOII (cres.getInt(1));
                EQUI.setClub(EClub.obtener(cres.getInt(2)));
                EQUI.setNombre(cres.getString(3));
                EQUI.setSexo(cres.getString(4));
                EQUI.setPosicion(cres.getString(5));
                EQUI.setPais(EPais.obtener(cres.getInt(6)));
                lst.add(EQUI);
            }          
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return lst;    
    }
    public static boolean insertar(EQUIPOII EQUI){
        boolean res=false;
        String sql= "insertar valores del futbolista()";
        try{
            ArrayList<Parametro> lstpar= new ArrayList<>();
            lstpar.add(new Parametro(1,Equi.getId_EQUIPOII()));
            lstpar.add(new Parametro(2,Equi.getClub().getId_club()));
            lstpar.add(new Parametro(3,Equi.getNombre()));
            lstpar.add(new Parametro(4,Equi.getSexo()));
            lstpar.add(new Parametro(5,Equi.getPosicion()));
            lstpar.add(new Parametro(6,Equi.getPais().getCodigo()));
            res=AccesoDatos.ejecutaComando1(sql, lstPar);
            
        }catch (Exception e){
            System.out.println(e.getMessege());
        }
        return res;
        
        
    }
    
    
}
