import java.util.ArrayList;
public class Main
{
    public static void printDataBase(Manager gestor){
        //Iterador
        for(Humano h: gestor.getDatabase(){
            System.out.println(h.getNombre() + "\t" + h.getEdad());
        }
    }
    public static void main(String args[]){
        Manager gestor = new Manager();
        
        Humano juan = new Estudiante("Juan", "Másculino",20,"32323232");
        Humano maria = new Estudiante("Maria", "Femenino",23, "555555");
        Humano guadalupe = new Estudiante("Guadalupe","Indefinido",19,"5465465");
        Humano guillermo = new Profesor("Guillermo","Masculino",46,"47126");
        Humano patricia = new Empleado("Patricia","Femenino",58,"4545");
        
        gestor.create(juan);
        gestor.create(maria);
        gestor.create(guadalupe);
        gestor.create(guillermo);
        gestor.create(patricia);
        
        
        Main.printDataBase(gestor);
        gestor.delete(1);
        
        Main.printDataBase(gestor);
        
        Humano h2Update = new Profesor(2,"Rudomin","Masculino",50,"555");
        gestor.update(2,h2Update);
        
        Main.printDataBase(gestor);
        
    }
}