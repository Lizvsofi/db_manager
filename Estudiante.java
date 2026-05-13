public class Estudiante extends Humano
{
    private String matricula;
    
    public Estudiante(){
        super();
        this.matricula = "1111";
    }
    
    public Estudiante (String nombre, String genero, int edad, String matricula){
        super(nombre, genero, edad);
        this.matricula = matricula;
    }
    
    //Getters y setters
    
    public String getMatricula(){
        return this.matricula;
    }
    
    public void setMatricula(String matricula){
        this.matricula = matricula;
    }
}