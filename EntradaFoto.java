import java.time.LocalDateTime;
import java.util.ArrayList;
import java.time.temporal.ChronoUnit;

public class EntradaFoto
{
    // instance variables - replace the example below with your own
    private String usuario;
    private String urlImagen;
    private String titulo;
    private LocalDateTime momentoPublicacion;
    private int cantidadMeGusta;
    private ArrayList<String> comentarios;

    /**
     * Constructor for objects of class EntradaFoto
     */
    public EntradaFoto(String autor, String url, String titulo)
    {
        usuario = autor;
        urlImagen = url;
        this.titulo = titulo;
        momentoPublicacion = LocalDateTime.now();
        cantidadMeGusta = 0;
        comentarios = new ArrayList<>();
    }
    
    public void meGusta()
    {
        cantidadMeGusta++;
    }
    
    public void unLike()
    {
        cantidadMeGusta--;
    }
    
    public void addComentario(String texto)
    {
        comentarios.add(texto);
    }
    
    public String getUrlImagen()
    {
        return urlImagen;
    }
    
    public String getTituloImagen()
    {
        return titulo;
    }
    
    public LocalDateTime getMomentoPublicacion()
    {
        return momentoPublicacion;
    }
    
    public String toString()
    {
        String textoADevolver = null;
        textoADevolver += "Usuario: " + usuario + "\n";
        textoADevolver += titulo + "\n";
        textoADevolver += urlImagen + "\n";
        textoADevolver += cantidadMeGusta + " me gusta";
        textoADevolver += "Usuario: " + usuario + "\n";
        textoADevolver += "Usuario: " + usuario + "\n";
        
        long segundosQueHanpasadoDesdeCreacion = momentoPublicacion.until(LocalDateTime.now(), ChronoUnit.MINUTES);
        long minutosQueHanpasadoDesdeCreacion = segundosQueHanpasadoDesdeCreacion / 60;
        long segundosResiduales = segundosQueHanpasadoDesdeCreacion % 60;
        
        textoADevolver += "Hace: ";
        if (minutosQueHanpasadoDesdeCreacion == 0){
            textoADevolver += minutosQueHanpasadoDesdeCreacion + " minutos ";
        }
        textoADevolver += segundosResiduales + " segundos.\n";
        
        if (comentarios.isEmpty()){
            textoADevolver += " La entrada no tiene comentarios.";
        }
        else{
            textoADevolver += "comentarios:\n";
            for (String comentario : comentarios){
                textoADevolver += comentario + "\n";
            }
        }
        
        return textoADevolver;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
