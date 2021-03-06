import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
/**
 * Write a description of class EntradaUnionAGrupo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EntradaUnionAGrupo extends Entrada
{
    // instance variables - replace the example below with your own
    private String grupo;

    /**
     * Constructor for objects of class EntradaUnionAGrupo
     */
    public EntradaUnionAGrupo(String usuario, String grupo)
    {
        super(usuario);
        this.grupo = grupo;
    }
    
    public EntradaUnionAGrupo(String autor, int meGusta, int year, int month, int dayOfMonth, int hour, int minute, String grupo)
    {
        super(autor, meGusta, year, month, dayOfMonth, hour, minute);
        this.grupo = grupo;
    }
    
    public String getGrupo()
    {
        return grupo;
    }
    
    public String toString()
    {
        String textoADevolver = super.toString();
        textoADevolver += "Se ha unido al grupo: " + grupo + "\n";
        return textoADevolver;
    }
    
    public void mostrar()
    {
        System.out.println(this);
    }
    
    @Override
    public int getCantidadDeDatosAsociadosALaEntrada()
    {
        return 4;
    }
    
    public void mostrarDatosExclusivos()
    {
        System.out.println(grupo);
    }
    
    public String getDatosExclusivos()
    {
        return grupo;
    }
    
    public String getHtml()
    {
        String textoADevolver = super.getHtml();
        textoADevolver += "<div>\n";
        textoADevolver += "<p class=\"texto\">Se ha unido al grupo: " + grupo + "</p>\n";
        textoADevolver += "<div class=\"tiempo\">\n";
        textoADevolver += super.getHtmlTiempo();
        textoADevolver += "</div>\n";
        textoADevolver += "<div class=\"meGusta\">\n";
        textoADevolver += super.getHtmlMeGusta();
        textoADevolver += "</div></br></br>\n";
        textoADevolver += "</div>\n";
        
        return textoADevolver;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
