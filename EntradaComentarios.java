import java.util.ArrayList;
/**
 * Write a description of class EntradaComentarios here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class EntradaComentarios extends Entrada
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
    
    public EntradaComentarios(String usuario, int meGusta, int year, int month, int dayOfMonth, int hour, int minute, ArrayList<String> comentarios)
    {
        super(usuario, meGusta, year, month, dayOfMonth, hour, minute);
        this.comentarios = comentarios;
    }
    
    public void addComentario(String texto)
    {
        comentarios.add(texto);
    }
    
    public ArrayList<String> getComentarios()
    {
        return comentarios;
    }
    
    public abstract int getCantidadDeDatosAsociadosALaEntrada();
    
    
    public String toString()
    {
        String textoADevolver = super.toString();
        if (getComentarios().isEmpty()){
            textoADevolver += "La entrada no tiene comentarios.\n";
        }
        else{
            textoADevolver += "Comentarios:\n";
            for (String comentario : getComentarios()){
                textoADevolver += comentario + "\n";
            }
        }
        return textoADevolver;
    }
    
    public String getHtml()
    {
        String textoADevolver = super.getHtml();
        return textoADevolver;
    }
    
    public String getHtmlComentarios()
    {
        String textoADevolver = "";
        if (getComentarios().isEmpty()){
            textoADevolver += "<p>La entrada no tiene comentarios.</p>\n";
        }
        else{
            textoADevolver += "<p class=\"comentarios\">Comentarios:</p>\n";
            for (String comentario : getComentarios()){
                textoADevolver += "<p>" + comentario + "</p>\n";
            }
        }
        return textoADevolver;
    }
    
    public String getHtmlTiempo()
    {
        String textoADevolver = super.getHtmlTiempo();
        return textoADevolver;
    }
    
    public String getHtmlMeGusta()
    {
        String textoADevolver = super.getHtmlMeGusta();
        return textoADevolver;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
