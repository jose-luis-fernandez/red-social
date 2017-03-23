

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
    private EntradaFoto entradaF1;
    private EntradaTexto entradaT1;
    private EntradaUnionAGrupo entradaU1;
    private Muro muro1;

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
        entradaF1 = new EntradaFoto("pepe", "http\\www.asd.com", "foto1");
        entradaT1 = new EntradaTexto("pepe", "Hola atodos");
        entradaU1 = new EntradaUnionAGrupo("pepe", "dam1");
        muro1 = new Muro();
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
