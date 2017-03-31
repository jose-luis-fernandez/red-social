

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class MuroTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class MuroTest
{
    private EntradaTexto entradaT1;
    private EntradaUnionAGrupo entradaU1;
    private Muro muro1;
    private EntradaUnionAGrupo entradaU2;
    private EntradaFoto entradaF2;
    private EntradaTexto entradaT2;
    private EntradaFoto entradaF3;

    
    
    
    
    
    
    
    

    
    
    
    
    
    
    

    
    
    
    
    
    
    

    
    
    
    
    
    
    

    
    
    
    

    /**
     * Default constructor for test class MuroTest
     */
    public MuroTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        entradaT1 = new EntradaTexto("pepe", "Hola a todos");
        entradaU1 = new EntradaUnionAGrupo("pepe", "dam1");
        muro1 = new Muro();
        entradaU2 = new EntradaUnionAGrupo("Alba", "DAM2");
        entradaF2 = new EntradaFoto("Alba", "http://www.ideagc.com/wp-content/uploads/2016/06/playa-1.jpg", "De vacaciones");
        entradaT2 = new EntradaTexto("Alba", "Hola a todos de parte de Alba");
        muro1.addEntrada(entradaU1);
        muro1.addEntrada(entradaF2);
        muro1.addEntrada(entradaT1);
        muro1.addEntrada(entradaU2);
        muro1.addEntrada(entradaT2);
        entradaT1.addComentario("Holaaaa");
        entradaT1.addComentario("Hola a ti tambien");
        entradaF3 = new EntradaFoto("pepe", "http://3.bp.blogspot.com/-R7bsoKWZ_cs/VLHH4JNkOOI/AAAAAAAAAAg/fF5aazgBts4/s1600/dalmata-580x380.jpg", "Mi perro");
        muro1.addEntrada(entradaF3);
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
}
