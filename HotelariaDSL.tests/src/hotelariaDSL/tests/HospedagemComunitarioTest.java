/**
 */
package hotelariaDSL.tests;

import hotelariaDSL.HospedagemComunitario;
import hotelariaDSL.HotelariaDSLFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Hospedagem Comunitario</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class HospedagemComunitarioTest extends HospedagemTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(HospedagemComunitarioTest.class);
	}

	/**
	 * Constructs a new Hospedagem Comunitario test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HospedagemComunitarioTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Hospedagem Comunitario test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected HospedagemComunitario getFixture() {
		return (HospedagemComunitario)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(HotelariaDSLFactory.eINSTANCE.createHospedagemComunitario());
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

} //HospedagemComunitarioTest
