import java.util.ArrayList;

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
            textoADevolver += entrada + "\n";
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

    
    
    
    
    
    
}
