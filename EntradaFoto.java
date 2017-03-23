import java.time.LocalDateTime;
import java.util.ArrayList;
import java.time.temporal.ChronoUnit;

public class EntradaFoto extends EntradaComentarios
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
        String textoADevolver = super.toString();
        textoADevolver += titulo + "\n";
        textoADevolver += urlImagen + "\n";
        return textoADevolver;
    }
    
    public void mostrar()
    {
        System.out.println(this);
    }
    
    public int getCantidadDeDatosAsociadosALaEntrada()
    {
        return 6;
    }
    
    public void mostrarDatosExclusivos()
    {
        System.out.println(urlImagen + "\n" + titulo);
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
