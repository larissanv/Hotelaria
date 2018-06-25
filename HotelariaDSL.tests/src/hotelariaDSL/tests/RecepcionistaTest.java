/**
 */
package hotelariaDSL.tests;

import hotelariaDSL.HotelariaDSLFactory;
import hotelariaDSL.Recepcionista;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Recepcionista</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RecepcionistaTest extends SuperTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RecepcionistaTest.class);
	}

	/**
	 * Constructs a new Recepcionista test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RecepcionistaTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Recepcionista test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Recepcionista getFixture() {
		return (Recepcionista)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(HotelariaDSLFactory.eINSTANCE.createRecepcionista());
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

} //RecepcionistaTest
