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
    
    public String getGrupo()
    {
        return grupo;
    }
    
    public String toString()
    {
        String textoADevolver = "";
        textoADevolver += "Usuario: " + getUsuario() + "\n";
        textoADevolver += "Se ha unido al grupo: " + grupo + "\n";
        textoADevolver += getCantidadmeGusta() + " me gusta" + "\n";
        
        long segundosQueHanpasadoDesdeCreacion = getMomentoPublicacion().until(LocalDateTime.now(), ChronoUnit.SECONDS);
        long minutosQueHanpasadoDesdeCreacion = segundosQueHanpasadoDesdeCreacion / 60;
        long segundosResiduales = segundosQueHanpasadoDesdeCreacion % 60;
        
        textoADevolver += "Hace: ";
        if (minutosQueHanpasadoDesdeCreacion > 0){
            textoADevolver += minutosQueHanpasadoDesdeCreacion + " minutos ";
        }
        textoADevolver += segundosResiduales + " segundos.\n";
        System.out.println(textoADevolver);
        return textoADevolver;
    }
}
