public class Empleado extends Humano
{
    private String numEmpleado;
    
    public Empleado(){
        super();
        this.numEmpleado = "3333";
    }
    
    public Empleado (String nombre, String genero, int edad, String numEmpleado){
        super(nombre, genero, edad);
        this.numEmpleado = numEmpleado;
    }
    
    //Getters y setters
    
    public String getnumEmpleado(){
        return this.numEmpleado;
    }
    
    public void setnumEmpleado(String numEmpleado){
        this.numEmpleado = numEmpleado;
    }
}