import java.time.LocalDateTime;
import java.util.ArrayList;
import java.time.temporal.ChronoUnit;
/**
 * Write a description of class EntradaTexto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EntradaTexto extends EntradaComentarios
{
    // instance variables - replace the example below with your own
    private String mensaje;

    /**
     * Constructor for objects of class EntradaTexto
     */
    public EntradaTexto(String autor, String texto)
    {
        super(autor);
        mensaje = texto;
    }
    
    public String getMensaje()
    {
        return mensaje;
    }
    
    
    public String toString()
    {
        String textoADevolver = super.toString();
        textoADevolver += mensaje + "\n";
        return textoADevolver;
    }
    
    public void mostrar()
    {
        System.out.println(this);
    }
    
    public int getCantidadDeDatosAsociadosALaEntrada()
    {
        return 5;
    }
    
    public void mostrarDatosExclusivos()
    {
        System.out.println(mensaje);
    }
    
    public String getDatosExclusivos()
    {
        return mensaje;
    }
    
    public String getHtml()
    {
        String textoADevolver = super.getHtml();
        textoADevolver += "<p class=\"texto\">" + mensaje + "</p>\n";
        textoADevolver += "<div class=\"tiempo\">\n";
        textoADevolver += super.getHtmlTiempo() + "\n";
        textoADevolver += "</div>\n";
        textoADevolver += "<div class=\"meGusta\">\n";
        textoADevolver += super.getHtmlMeGusta();
        textoADevolver += "</div>\n";
        textoADevolver += getHtmlComentarios();
        return textoADevolver;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
