public class Profesor extends Humano
{
    
    private String numEconomico;
    
    public Profesor(){
        super();
        this.numEconomico = "2222";
    }
    
    public Profesor (String nombre, String genero, int edad, String numEconomico){
        super(nombre, genero, edad);
        this.numEconomico = numEconomico;
    }
    
    //Getters y setters
    
    public String getnumEconomico(){
        return this.numEconomico;
    }
    
    public void setnumEconomico(String numEconomico){
        this.numEconomico = numEconomico;
    }
}