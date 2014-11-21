import junit.framework.TestCase;

public class RationalTest extends TestCase {

    protected Rational HALF;

    protected void setUp() {
      HALF = new Rational( 1, 2 );
    }

    // Create new test
    public RationalTest (String name) {
        super(name);
    }

    public void testEquality() {
        assertEquals(new Rational(1,3), new Rational(1,3));
        assertEquals(new Rational(1,3), new Rational(2,6));
        assertEquals(new Rational(3,3), new Rational(1,1));
    }

    // Test for nonequality
    public void testNonEquality() {
        assertFalse(new Rational(2,3).equals(
            new Rational(1,3)));
    }

    public void testAccessors() {
    	assertEquals(new Rational(2,3).numerator(), 2);
    	assertEquals(new Rational(2,3).denominator(), 3);
    }

    public void testRoot() {
        Rational s = new Rational( 1, 4 );
        Rational sRoot = null;
        try {
            sRoot = s.root();
        } catch (IllegalArgumentToSquareRootException e) {
            e.printStackTrace();
        }
        assertTrue( sRoot.isLessThan( HALF.plus( Rational.getTolerance() ) ) 
                        && HALF.minus( Rational.getTolerance() ).isLessThan( sRoot ) );
    }
    public void testEqual1(){
         assertTrue(new Rational(-2,3).equals(new Rational(4,-6)));
    }
    public void testPlus1(){
    	assertEquals(new Rational(1, 13).plus(new Rational(-1, 13)), new Rational(0, 1)); 
    }
    public void testTimes1(){
    	assertEquals(new Rational(1, 13).times(new Rational(-1, 13)), new Rational(1, -169)); 
    }
     public void testDivides1(){
    	assertEquals(new Rational(0, 13).divides(new Rational(-1, 13)), new Rational(0, 1)); 
    }
    public void testRoot1(){
	 try {
            assertEquals(new Rational(4, 1).root(), new Rational(2, 1)); 
        } catch (IllegalArgumentToSquareRootException e) {
            e.printStackTrace();
        }
    	
    }
     public void testRoot2(){
	 try {
            assertEquals(new Rational(1, 16).root(), new Rational(1, 4)); 
        } catch (IllegalArgumentToSquareRootException e) {
            e.printStackTrace();
        }
    	
    }
   public void testLess1(){
    	assertTrue(new Rational(-4, -1).isLessThan(new Rational(5, 1))); 
    }
    public void testLess2(){
    	assertTrue(new Rational(4, -5).isLessThan(new Rational(6, 1))); 
    }
    public void testAbs1(){
    	assertEquals(new Rational(1, -5).abs(), new Rational(1, 5)); 
    }

    public static void main(String args[]) {
        String[] testCaseName = 
            { RationalTest.class.getName() };
        // junit.swingui.TestRunner.main(testCaseName);
        junit.textui.TestRunner.main(testCaseName);
    }
}
