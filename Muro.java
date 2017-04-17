import java.util.ArrayList;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.io.BufferedWriter;
import java.nio.file.Files;
import java.io.IOException;
import java.awt.Desktop;
import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;
import java.net.URL;

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
                archivo.write("<div class=\"gris\">\n");
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
    
    public void mostrarMuroEnNavegador(String usuario)
    {
        entradas.clear();
        try {
            URL url = new URL("https://script.google.com/macros/s/AKfycbzHc3p1twTfyF7o0_cxSwnxSsyOemuHnSu406ly9DZIf5Ck2BA/exec?user=" + usuario);
            Scanner sc = new Scanner(url.openStream());
            ArrayList<String> lineasEntrada = new ArrayList<>();
            while (sc.hasNextLine()) {
                lineasEntrada.add(sc.nextLine());
            }
            
            for (String lineaActual : lineasEntrada){
                if (lineaActual.contains("EntradaTexto")){
                    String linea[] = lineaActual.split(";");
                    String nombreUsuario = linea[1];
                    int meGusta = Integer.parseInt(linea[2]);
                    String fechaHora[] = linea[3].split("-");
                    String fecha[] = fechaHora[0].split("/");
                    String hora[] = fechaHora[1].split(":");
                    int dia = Integer.parseInt(fecha[0]);
                    int mes = Integer.parseInt(fecha[1]);
                    int anio = Integer.parseInt(fecha[2]);
                    int horaEntero = Integer.parseInt(hora[0]);
                    int minuto = Integer.parseInt(hora[1]);
                    String texto = linea[4];
                    ArrayList<String> pilaComentarios = new ArrayList<>();
                    if (!linea[5].equals("Sin comentarios")){
                        String comentarios[] = linea[5].split("%");
                        for (String comentarioActual : comentarios){
                            pilaComentarios.add(comentarioActual);
                        }
                    }
                    Entrada entradaTexto = new EntradaTexto(nombreUsuario, meGusta, anio, mes, dia, horaEntero, minuto, texto, pilaComentarios);
                    addEntrada(entradaTexto);
                }
                else if (lineaActual.contains("EntradaFoto")){
                    String linea[] = lineaActual.split(";");
                    String nombreUsuario = linea[1];
                    int meGusta = Integer.parseInt(linea[2]);
                    String fechaHora[] = linea[3].split("-");
                    String fecha[] = fechaHora[0].split("/");
                    String hora[] = fechaHora[1].split(":");
                    int dia = Integer.parseInt(fecha[0]);
                    int mes = Integer.parseInt(fecha[1]);
                    int anio = Integer.parseInt(fecha[2]);
                    int horaEntero = Integer.parseInt(hora[0]);
                    int minuto = Integer.parseInt(hora[1]);
                    String urlFoto = linea[4];
                    String tituloFoto = linea[5];
                    ArrayList<String> pilaComentarios = new ArrayList<>();
                    if (!linea[6].equals("Sin comentarios")){
                        String comentarios[] = linea[6].split("%");
                        for (String comentarioActual : comentarios){
                            pilaComentarios.add(comentarioActual);
                        }
                    }
                    Entrada entradaFoto = new EntradaFoto(nombreUsuario, meGusta, anio, mes, dia, horaEntero, minuto, urlFoto, tituloFoto, pilaComentarios);
                    addEntrada(entradaFoto);
                }
                else{
                    String linea[] = lineaActual.split(";");
                    String nombreUsuario = linea[1];
                    int meGusta = Integer.parseInt(linea[2]);
                    String fechaHora[] = linea[3].split("-");
                    String fecha[] = fechaHora[0].split("/");
                    String hora[] = fechaHora[1].split(":");
                    int dia = Integer.parseInt(fecha[0]);
                    int mes = Integer.parseInt(fecha[1]);
                    int anio = Integer.parseInt(fecha[2]);
                    int horaEntero = Integer.parseInt(hora[0]);
                    int minuto = Integer.parseInt(hora[1]);
                    String grupo = linea[4];
                    Entrada entradaUnionAGrupo = new EntradaUnionAGrupo(nombreUsuario, meGusta, anio, mes, dia, horaEntero, minuto, grupo);
                    addEntrada(entradaUnionAGrupo);
                }
            }
            
            sc.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        
        mostrarMuroEnNavegador();
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    
    
    
    

    
}
