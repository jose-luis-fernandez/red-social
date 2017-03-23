import java.util.ArrayList;

public class Muro
{
    // instance variables - replace the example below with your own
    private ArrayList<Entrada> entradas;
    
    /**
     * Constructor for objects of class Muro
     */
    public Muro()
    {
        entradas = new ArrayList<Entrada>();
    }
    
    public void addEntrada(Entrada entrada)
    {
        entradas.add(entrada);
    }
    
    public String toString()
    {
        String textoADevolver = "";
        
        for (Entrada entrada : entradas){
            textoADevolver += entrada + "\n";
        }
        return textoADevolver;
    }
    
    public void mostrar()
    {
        System.out.println(this);
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
