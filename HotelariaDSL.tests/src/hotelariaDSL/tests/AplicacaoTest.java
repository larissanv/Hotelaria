/**
 */
package hotelariaDSL.tests;

import hotelariaDSL.Aplicacao;
import hotelariaDSL.HotelariaDSLFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Aplicacao</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AplicacaoTest extends TestCase {

	/**
	 * The fixture for this Aplicacao test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Aplicacao fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AplicacaoTest.class);
	}

	/**
	 * Constructs a new Aplicacao test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AplicacaoTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Aplicacao test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Aplicacao fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Aplicacao test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Aplicacao getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(HotelariaDSLFactory.eINSTANCE.createAplicacao());
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

} //AplicacaoTest
