import java.util.ArrayList;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.io.BufferedWriter;
import java.nio.file.Files;
import java.io.IOException;
import java.awt.Desktop;
import java.io.File;
public class Muro
{
    // instance variables - replace the example below with your own
    private ArrayList<Entrada> entradas;

    /**
     * Constructor for objects of class Muro
     */
    public Muro()
    {
        entradas = new ArrayList<Entrada>();
    }

    public void addEntrada(Entrada entrada)
    {
        entradas.add(entrada);
    }

    public String toString()
    {
        String textoADevolver = "";

        for (Entrada entrada : entradas){
            textoADevolver += entrada.toString() + "\n";
        }
        return textoADevolver;
    }

    public void mostrar()
    {
        System.out.println(this);
    }

    public void verCantidadDatosPorEntrada()
    {
        for (Entrada entrada : entradas){
            System.out.println(entrada.getCantidadDeDatosAsociadosALaEntrada());
        }

    }

    public void mostrarDatosExclusivosEntradasFiltradas(String tipoEntrada, String usuario)
    {
        if (tipoEntrada != null && usuario != null){
            for (Entrada entrada : entradas){

                if (tipoEntrada.equals("EntradaTexto")){
                    if (entrada instanceof EntradaTexto && entrada.getUsuario().equals(usuario)){
                        ((EntradaTexto)entrada).mostrarDatosExclusivos();
                    }
                }

                if (tipoEntrada.equals("EntradaFoto")){
                    if (entrada instanceof EntradaFoto && entrada.getUsuario().equals(usuario)){
                        ((EntradaFoto)entrada).mostrarDatosExclusivos();
                    }
                }

                if (tipoEntrada.equals("EntradaUnionAGrupo")){
                    if (entrada instanceof EntradaUnionAGrupo && entrada.getUsuario().equals(usuario)){
                        ((EntradaUnionAGrupo)entrada).mostrarDatosExclusivos();
                    }
                }

            }
        }
        else if(usuario != null && tipoEntrada == null){
            for (Entrada entrada : entradas){
                if (entrada.getUsuario().equals(usuario)){
                    if (entrada instanceof EntradaTexto){
                        ((EntradaTexto)entrada).mostrarDatosExclusivos();
                    }

                    if (entrada instanceof EntradaFoto){
                        ((EntradaFoto)entrada).mostrarDatosExclusivos();
                    }

                    if (entrada instanceof EntradaUnionAGrupo){
                        ((EntradaUnionAGrupo)entrada).mostrarDatosExclusivos();
                    }
                }
            }
        }
        else{
            for (Entrada entrada : entradas){

                if (tipoEntrada.equals("EntradaTexto")){
                    if (entrada instanceof EntradaTexto){
                        ((EntradaTexto)entrada).mostrarDatosExclusivos();
                    }
                }

                if (tipoEntrada.equals("EntradaFoto")){
                    if (entrada instanceof EntradaFoto){
                        ((EntradaFoto)entrada).mostrarDatosExclusivos();
                    }
                }

                if (tipoEntrada.equals("EntradaUnionAGrupo")){
                    if (entrada instanceof EntradaUnionAGrupo){
                        ((EntradaUnionAGrupo)entrada).mostrarDatosExclusivos();
                    }
                }

            }
        }

    }
    
    public void mostrarMuroEnNavegador()
    {
        // Obtenemos una referencia a una ruta donde estará el archivo
        Path rutaArchivo = Paths.get("output.html");

        // Abrimos el archivo, escribimos en él y lo cerramos. Si se produce una
        try  
        {
            BufferedWriter archivo = Files.newBufferedWriter(rutaArchivo);
            archivo.write("<html>\n");
            archivo.write("<head>\n");
            archivo.write("<title>Muro</title>\n");
            archivo.write("<link href=\"output.css\" type=\"text/css\" rel=\"stylesheet\"/>\n");
            archivo.write("</head>\n");
            archivo.write("<body>\n");
            for (Entrada entrada : entradas){
                archivo.write("<div class=\"entradaTexto\">\n");
                archivo.write("<div class=\"contenido\">\n");
                archivo.write(entrada.getHtml());
                archivo.write("</div>\n");
                archivo.write("</div>\n");
            }   
            archivo.write("</body>\n");
            archivo.write("</html>\n");
            archivo.close();
        }
        catch (IOException excepcion) {
            // Mostramos por pantalla la excepción que se ha producido
            System.out.println(excepcion.toString());
        }
        
        try {

            File objetofile = new File ("output.html");
            Desktop.getDesktop().open(objetofile);

     }catch (IOException ex) {

            System.out.println(ex);

     }
    }

    
    
    
    

    
}
