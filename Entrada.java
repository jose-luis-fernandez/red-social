import java.time.LocalDateTime;
import java.util.ArrayList;
import java.time.temporal.ChronoUnit;
/**
 * Write a description of class Entrada here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Entrada
{
    // instance variables - replace the example below with your own
    private String usuario;
    private LocalDateTime momentoPublicacion;
    private int cantidadMeGusta;

    /**
     * Constructor for objects of class Entrada
     */
    public Entrada(String usuario)
    {
        this.usuario = usuario;
        momentoPublicacion = LocalDateTime.now();
        cantidadMeGusta = 0;
    }
    
    public void meGusta()
    {
        cantidadMeGusta++;
    }
    
    public LocalDateTime getMomentoPublicacion()
    {
        return momentoPublicacion;
    }
    
    public String toString()
    {
        String textoADevolver = "";
        textoADevolver += "Usuario: " + getUsuario() + "\n";
        long segundosQueHanpasadoDesdeCreacion = getMomentoPublicacion().until(LocalDateTime.now(), ChronoUnit.SECONDS);
        long minutosQueHanpasadoDesdeCreacion = segundosQueHanpasadoDesdeCreacion / 60;
        long segundosResiduales = segundosQueHanpasadoDesdeCreacion % 60;
        textoADevolver += "Hace: ";
        if (minutosQueHanpasadoDesdeCreacion > 0){
            textoADevolver += minutosQueHanpasadoDesdeCreacion + " minutos ";
        }
        textoADevolver += segundosResiduales + " segundos.\n";
        textoADevolver += getCantidadmeGusta() + " me gusta" + "\n";
        return textoADevolver;
    }
    
    public String getUsuario()
    {
        return usuario;
    }
    
    public int getCantidadmeGusta()
    {
        return cantidadMeGusta;
    }
    
    public void mostrar()
    {
        
    }
    
    public int getCantidadDeDatosAsociadosALaEntrada()
    {
        return 0;
    }
    
    public String getHtml()
    {
        String textoADevolver = "";
        textoADevolver += "<p class=\"usuario\">Usuario: " + getUsuario() + "</p>\n";
        
        return textoADevolver;
    }
    
    public String getHtmlTiempo()
    {
        String textoADevolver = "";
        long segundosQueHanpasadoDesdeCreacion = getMomentoPublicacion().until(LocalDateTime.now(), ChronoUnit.SECONDS);
        long minutosQueHanpasadoDesdeCreacion = segundosQueHanpasadoDesdeCreacion / 60;
        long segundosResiduales = segundosQueHanpasadoDesdeCreacion % 60;
        textoADevolver += "<p>Hace: ";
        if (minutosQueHanpasadoDesdeCreacion > 0){
            textoADevolver += minutosQueHanpasadoDesdeCreacion + " minutos ";
        }
        textoADevolver += segundosResiduales + " segundos.</p>";
        return textoADevolver;
    }
    
    public String getHtmlMeGusta()
    {
        String textoADevolver = "";
        textoADevolver += "<p>" + getCantidadmeGusta() + " me gusta" + "</p>\n";
        return textoADevolver;
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
