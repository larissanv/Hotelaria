/**
 */
package hotelariaDSL.tests;

import hotelariaDSL.Hospede;
import hotelariaDSL.HotelariaDSLFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Hospede</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class HospedeTest extends SuperTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(HospedeTest.class);
	}

	/**
	 * Constructs a new Hospede test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HospedeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Hospede test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Hospede getFixture() {
		return (Hospede)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(HotelariaDSLFactory.eINSTANCE.createHospede());
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

} //HospedeTest
