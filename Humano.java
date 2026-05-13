public class Humano
{
    private String nombre;
    private String genero;
    private int edad;

    /**
     * Constructor for objects of class Humano
     */
    public Humano()
    {
        this.nombre = "";
        this.genero = "No determinado";
        this.edad = 0;
    }
    
    public Humano(String nombre, String genero, int edad)
    {
        this.nombre = nombre;
        this.genero = genero;
        this.edad = edad;
    }

    //Getter and Setters
    public String getNombre(){
        return this.nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getGenero(){
        return this.genero;
    }
    
    public void setGenero(String genero){
        this.genero = genero;
    }
    
    public int getEdad(){
        return this.edad;
    }
    
    public void setEdad(int edad){
        this.edad = edad;
    }
}