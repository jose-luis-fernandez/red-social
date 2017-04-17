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
    
    public EntradaFoto(String autor, int meGusta, int year, int month, int dayOfMonth, int hour, int minute, String url, String titulo, ArrayList comentarios)
    {
        super(autor, meGusta, year, month, dayOfMonth, hour, minute, comentarios);
        this.titulo = titulo;
        urlImagen = url;
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
    
    public String getDatosExclusivos()
    {
        String textoADevolver = "";
        textoADevolver += urlImagen;
        textoADevolver += titulo;
        return textoADevolver;
    }
    
    public String getHtml()
    {
        String textoADevolver = super.getHtml();
        textoADevolver += "<p class=\"texto\">" + titulo + "</p>\n";
        textoADevolver += "<div class=\"foto\">\n";
        textoADevolver += "<img src=\"" + urlImagen + "\" width=\"500\">\n";
        textoADevolver += "</div>\n";
        textoADevolver += "<div class=\"tiempo\">\n";
        textoADevolver += super.getHtmlTiempo();
        textoADevolver += "</div>\n";
        textoADevolver += "<div class=\"meGusta\">\n";
        textoADevolver += super.getHtmlMeGusta();
        textoADevolver += "</div>\n";
        textoADevolver += getHtmlComentarios();
        return textoADevolver;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
