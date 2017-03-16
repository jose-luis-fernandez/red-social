import java.time.LocalDateTime;
import java.util.ArrayList;
import java.time.temporal.ChronoUnit;
/**
 * Write a description of class EntradaTexto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EntradaTexto extends Entrada
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
        String textoADevolver = null;
        textoADevolver += "Usuario: " + getUsuario() + "\n";
        textoADevolver += mensaje + "\n";
        textoADevolver += getCantidadmeGusta() + " me gusta";
        
        long segundosQueHanpasadoDesdeCreacion = getMomentoPublicacion().until(LocalDateTime.now(), ChronoUnit.MINUTES);
        long minutosQueHanpasadoDesdeCreacion = segundosQueHanpasadoDesdeCreacion / 60;
        long segundosResiduales = segundosQueHanpasadoDesdeCreacion % 60;
        
        textoADevolver += "Hace: ";
        if (minutosQueHanpasadoDesdeCreacion == 0){
            textoADevolver += minutosQueHanpasadoDesdeCreacion + " minutos ";
        }
        textoADevolver += segundosResiduales + " segundos.\n";
        
        if (getComentarios().isEmpty()){
            textoADevolver += " La entrada no tiene comentarios.";
        }
        else{
            textoADevolver += "comentarios:\n";
            for (String comentario : getComentarios()){
                textoADevolver += comentario + "\n";
            }
        }
        
        return textoADevolver;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
