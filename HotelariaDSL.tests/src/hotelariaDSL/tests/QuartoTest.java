/**
 */
package hotelariaDSL.tests;

import hotelariaDSL.HotelariaDSLFactory;
import hotelariaDSL.Quarto;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Quarto</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class QuartoTest extends SuperTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(QuartoTest.class);
	}

	/**
	 * Constructs a new Quarto test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuartoTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Quarto test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Quarto getFixture() {
		return (Quarto)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(HotelariaDSLFactory.eINSTANCE.createQuarto());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //QuartoTest
