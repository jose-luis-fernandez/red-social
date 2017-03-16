import java.time.LocalDateTime;
import java.util.ArrayList;
import java.time.temporal.ChronoUnit;

public class EntradaFoto extends Entrada
{
    // instance variables - replace the example below with your own
    private String urlImagen;
    private String titulo;

    /**
     * Constructor for objects of class EntradaFoto
     */
    public EntradaFoto(String autor, String url, String titulo)
    {
        super(autor);
        urlImagen = url;
        this.titulo = titulo;
    }
    
    
    public String getUrlImagen()
    {
        return urlImagen;
    }
    
    public String getTituloImagen()
    {
        return titulo;
    }
    
    
    public String toString()
    {
        String textoADevolver = null;
        textoADevolver += "Usuario: " + getUsuario() + "\n";
        textoADevolver += titulo + "\n";
        textoADevolver += urlImagen + "\n";
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
