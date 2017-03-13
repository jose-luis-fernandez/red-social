import java.util.ArrayList;

public class Muro
{
    // instance variables - replace the example below with your own
    private ArrayList<EntradaTexto> mensajes;
    private ArrayList<EntradaFoto> fotos;
    /**
     * Constructor for objects of class Muro
     */
    public Muro()
    {
        mensajes = new ArrayList<EntradaTexto>();
        fotos = new ArrayList<EntradaFoto>();
    }
    
    public void addEntradaTexo(EntradaTexto entradaTexo)
    {
        mensajes.add(entradaTexo);
    }
    
    public void addEntradaFoto(EntradaFoto entradaFoto)
    {
        fotos.add(entradaFoto);
    }
    
    public String toString()
    {
        String textoADevolver = null;
        
        for (EntradaTexto entrada : mensajes){
            textoADevolver += entrada + "\n";
        }
        
        for (EntradaFoto foto : fotos){
            textoADevolver += foto + "\n";
        }
        
        return textoADevolver;
    }
    
    public void mostrar()
    {
        System.out.println(this);
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
