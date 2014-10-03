package dragndrop;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;


/**
 * Unit test for simple App.
 */
public class DudeTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public DudeTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( DudeTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testDude()
    {
        Dude dude = new Dude();
        
        try {
            assertTrue(dude.greet("Hi!").equals("Hellou!"));
        } catch(Exception e) {
            assertTrue(false);
        }
    }
}
