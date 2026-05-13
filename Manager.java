import java.util.ArrayList;
public class Manager 
{
    private ArrayList<Humano> database;
    public Manager(){
        this.database = new ArrayList<Humano>();
    }
    
    //Asignacion de responsabilidades
    
    /**
     * Agregar un objeto de tipo Humano a la lista llamada database (atributo de clase).
     * @return Regresa true si la inserción se realizó correctamente.
     */
    public boolean create(Humano humano){
       this.database.add(humano);
       return true; 
    }
    /**
     * Obtiene el objeto con el id del parametro
     * @param id Identificador del objeto Humano que se desea buscar.
     * @return Humano regresa el objeto encontrado de la clase Humano
     */
    public Humano readByNombre(String nombre){
        for(Humano h: this.database){
            if(h.getNombre().equalsIgnoreCase(nombre))
               return h;
            }
        return null;
    } 
    /**
     * Actualiza el objeto humano en la base datos si lo encuentra.
     * @param id Identificador del objeto Humano que se desea buscar.
     * @param humano El objeto que se desea que reemplace al objeto encontrado por el id
     * @return true si el objeto se reemplazó correctamente
     */
    public boolean update(int id, Humano humano){
        for(Humano h: this.database){
            if(h.getId()==id){
                Humano success = this.database.set(id, humano);
                if(success != null)
                    return true;
                return false;
            }
        }
        return false;
    }
    
    /**
     * Elimina el objeto con el id del parámetro de la base de datos
     * @return true si el objeto es eliminado correctamente
     */
    public boolean delete(int id){
        Humano success = this.database.remove(id);
        if(success
    }
}