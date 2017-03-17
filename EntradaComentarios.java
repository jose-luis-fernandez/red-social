import java.util.ArrayList;
/**
 * Write a description of class EntradaComentarios here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EntradaComentarios extends Entrada
{
    // instance variables - replace the example below with your own
    private ArrayList<String> comentarios;

    /**
     * Constructor for objects of class EntradaComentarios
     */
    public EntradaComentarios(String usuario)
    {
        super(usuario);
        comentarios = new ArrayList<>();
    }
    
    public void addComentario(String texto)
    {
        comentarios.add(texto);
    }
    
    public ArrayList<String> getComentarios()
    {
        return comentarios;
    }
}
