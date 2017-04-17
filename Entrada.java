import java.time.LocalDateTime;
import java.util.ArrayList;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
import java.util.ArrayList;
import java.net.URL;
/**
 * Write a description of class Entrada here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Entrada
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
    
    public Entrada(String usuario, int meGusta, int year, int month, int dayOfMonth, int hour, int minute)
    {
        this.usuario = usuario;
        cantidadMeGusta = meGusta;
        momentoPublicacion = LocalDateTime.of(year, month, dayOfMonth, hour, minute);
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
    
    public abstract void mostrar();
    
    public abstract int getCantidadDeDatosAsociadosALaEntrada();
    
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
        long diasQueHanpasadoDesdeCreacion = ((segundosQueHanpasadoDesdeCreacion / 60) / 60) / 24;
        long horasQueHanpasadoDesdeCreacion = (segundosQueHanpasadoDesdeCreacion / 60) / 60;
        long minutosResiduales = ((segundosQueHanpasadoDesdeCreacion / 60) / 60) % 60;
        long minutosQueHanpasadoDesdeCreacion = segundosQueHanpasadoDesdeCreacion / 60;
        long segundosResiduales = segundosQueHanpasadoDesdeCreacion % 60;
        textoADevolver += "<p>Hace: ";
        if (horasQueHanpasadoDesdeCreacion > 24){
            textoADevolver += diasQueHanpasadoDesdeCreacion + " dias ";
        }
        else {
            if (horasQueHanpasadoDesdeCreacion > 0){
                textoADevolver += horasQueHanpasadoDesdeCreacion + " horas ";
            }
            else if (minutosQueHanpasadoDesdeCreacion > 0){
                textoADevolver += minutosQueHanpasadoDesdeCreacion + " minutos ";
            }
            textoADevolver += minutosResiduales + " minutos ";
            textoADevolver += segundosResiduales + " segundos.</p>\n";
        }
        
        
        
        return textoADevolver;
    }
    
    public String getHtmlMeGusta()
    {
        String textoADevolver = "";
        textoADevolver += "<p>" + getCantidadmeGusta() + " me gusta" + "</p>\n";
        return textoADevolver;
    }
    
    

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
